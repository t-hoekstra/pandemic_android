package com.calenaur.pandemic.api;

import android.content.Context;

import com.calenaur.pandemic.api.net.HTTPClient;
import com.calenaur.pandemic.api.store.EventStore;
import com.calenaur.pandemic.api.store.MedicineStore;
import com.calenaur.pandemic.api.store.UserStore;

public class API {

    private HTTPClient httpClient;
    private UserStore userStore;
    private MedicineStore medicineStore;
    private EventStore eventStore;

    public API(Context context) {
        this.httpClient = new HTTPClient("https://api.calenaur.com", context);
        this.userStore = new UserStore(httpClient);
        this.medicineStore = new MedicineStore(httpClient);
        this.eventStore = new EventStore(httpClient);
    }

    public UserStore getUserStore() {
        return userStore;
    }

    public MedicineStore getMedicineStore() {
        return medicineStore;
    }

    public EventStore getEventStore() {
        return eventStore;
    }
}
