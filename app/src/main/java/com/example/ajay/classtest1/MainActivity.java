package com.example.ajay.classtest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements SensorEventListener,OnClickListener{

    private SensorManager sensorManager;
    private Sensor mySensor;
    private Sensor mGyro;
    private Sensor mTemp;
    private Sensor mMag;

    private TextView x;
    private TextView y;
    private TextView z;
    private TextView xg;
    private TextView yg;
    private TextView zg;
    private TextView xm;
    private TextView ym;
    private TextView zm;
    private TextView temp;

    private Button btnStart;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sensorManager=(SensorManager)getSystemService(SENSOR_SERVICE);
        mySensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sensorManager.registerListener(this, mySensor, SensorManager.SENSOR_DELAY_NORMAL);

        mGyro=sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);
        sensorManager.registerListener(this, mGyro, SensorManager.SENSOR_DELAY_NORMAL);

        mTemp=sensorManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE);
        sensorManager.registerListener(this, mTemp, SensorManager.SENSOR_DELAY_NORMAL);

        mMag=sensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);
        sensorManager.registerListener(this, mMag, SensorManager.SENSOR_DELAY_NORMAL);

        btnStart = (Button) findViewById(R.id.button);

        btnStart.setOnClickListener(this);

        btnStart.setEnabled(true);

        x=(TextView) findViewById(R.id.textView);
        y=(TextView) findViewById(R.id.textView2);
        z=(TextView) findViewById(R.id.textView3);
        xg=(TextView) findViewById(R.id.textView8);
        yg=(TextView) findViewById(R.id.textView9);
        zg=(TextView) findViewById(R.id.textView10);
        xm=(TextView) findViewById(R.id.textView11);
        ym=(TextView) findViewById(R.id.textView12);
        zm=(TextView) findViewById(R.id.textView13);
        temp=(TextView) findViewById(R.id.textView7);



    }
    protected void onResume() {
        super.onResume();

    }
    protected void onPause() {

        super.onPause();
        sensorManager.unregisterListener(this);
    }
    @Override
    public void onAccuracyChanged(Sensor sensor,int accuracy) {
    }
    @Override
    public void onSensorChanged(SensorEvent event)
    {

            x.setText("X : " + event.values[0]);
            y.setText("Y : " + event.values[1]);
            z.setText("Z : " + event.values[2]);
            xg.setText("X : " + event.values[0]);
            yg.setText("Y : " + event.values[1]);
            zg.setText("Z : " + event.values[2]);
            xm.setText("X : " + event.values[0]);
            ym.setText("Y : " + event.values[1]);
            zm.setText("Z : " + event.values[2]);
            temp.setText("Temperature : " + event.values[0]);




    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                btnStart.setEnabled(false);
                /*Intent myIntent = new Intent(MainActivity.this,NewActivity.class);
                startActivity(myIntent);*/

                break;


            default:
                break;
        }
    }



}
