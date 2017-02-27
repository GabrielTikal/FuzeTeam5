package com.tikal.fuze;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.tikal.fuze.model.Fields;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recycleview)
    android.support.v7.widget.RecyclerView mRecyclerView;

    @BindView(R.id.button)
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.recycleview);

        mRecyclerView.setHasFixedSize(false);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        RecyclerView.Adapter adapter = new SimpleAdapter(this);
        mRecyclerView.setAdapter(adapter);

    }

    private static class SimpleAdapter extends RecyclerView.Adapter<SimpleAdapter.SimpleViewHolder> {

        private final Context context;
        private final LayoutInflater layoutInflater;


        public abstract static class SimpleViewHolder extends RecyclerView.ViewHolder
        {
            protected final Context context;
            public SimpleViewHolder(Context context, View itemView) {

                super(itemView);
                this.context = context;
            }

            public abstract void bindData(Fields field);
        }

        private static class ValueViewHolder extends SimpleViewHolder
        {
            private TextView textView;
            private EditText editText;
            public ValueViewHolder(Context context, View itemView) {

                super(context, itemView);
                textView = (TextView)itemView.findViewById(R.id.textView);
                editText = (EditText)itemView.findViewById(R.id.editText);
            }

            public void bindData(Fields field)
            {
                textView.setText(context.getString(field.getLabelRes()));
                editText.setHint(context.getString(field.getLabelRes()));
            }
        }

        private static class SpinnerViewHolder extends SimpleViewHolder
        {
            private TextView textView;
            private Spinner spinner;

            public SpinnerViewHolder(Context context, View itemView) {
                super(context, itemView);

                textView = (TextView)itemView.findViewById(R.id.textView);
                spinner = (Spinner)itemView.findViewById(R.id.spinner);
            }

            public void bindData(Fields field)
            {
                textView.setText(context.getString(field.getLabelRes()));


                String [] array = context.getResources().getStringArray(field.getArrayRes());
                ArrayAdapter<String> adapter = new ArrayAdapter<String>
                        (context, android.R.layout.simple_spinner_item, array);

                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(adapter);
            }
        }

        public SimpleAdapter(Context context) {
            this.context = context;
            this.layoutInflater = LayoutInflater.from(context);
        }


        @Override
        public SimpleViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
            switch (viewType) {

                case Fields.TYPE_SPINNER:
                    final View spinnerView = layoutInflater.inflate(R.layout.spinner_item, parent, false);
                    return new SpinnerViewHolder(context, spinnerView);

                case Fields.TYPE_VALUE:
                    final View valueView = layoutInflater.inflate(R.layout.value_item, parent , false);
                    return new ValueViewHolder(context, valueView);
            }

            return null;
        }

        @Override
        public int getItemViewType(int position) {
            return Fields.values()[position].getType();
        }

        @Override
        public void onBindViewHolder(SimpleViewHolder holder, int position) {
            holder.bindData(Fields.values()[position]);
        }

        @Override
        public int getItemCount() {
            return Fields.values().length;
        }
    }
}
