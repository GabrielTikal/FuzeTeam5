package com.tikal.fuze.data.source;

import android.support.annotation.NonNull;
import com.tikal.fuze.model.Payload;
import rx.Observable;

public interface SalaryDataSource {

    Observable<Payload> getPayload(Payload payload);


    void savePayload(@NonNull Payload payload);
}
