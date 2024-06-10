package com.lahcencodes.remoteautobleu;

import android.app.Application;
import android.bluetooth.BluetoothSocket;

public class MyApplication extends Application {
    private BluetoothSocket bluetoothSocket;

    public BluetoothSocket getBluetoothSocket() {
        return bluetoothSocket;
    }

    public void setBluetoothSocket(BluetoothSocket bluetoothSocket) {
        this.bluetoothSocket = bluetoothSocket;
    }
}
