package com.example.ajay.classtest1.NewActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.jjoe64.graphview.LegendRenderer;
import android.graphics.Color;

public class java extends Activity {
    private GraphView mGraphGyro;
    private GraphView mGraphAccel;

    private GraphView mGraphTemp;
    private GraphView mGraphMag;
    private LineGraphSeries<DataPoint> mSeriesGyroX, mSeriesGyroY, mSeriesGyroZ;
    private LineGraphSeries<DataPoint> mSeriesAccelX, mSeriesAccelY, mSeriesAccelZ;

    private LineGraphSeries<DataPoint> mSeriesMagX, mSeriesMagY, mSeriesMagZ;
    private LineGraphSeries<DataPoint> mSeriesTemp;
    private double graphLastGyroXValue = 5d;
    private double graphLastAccelXValue = 5d;

    private double graphLastTempXValue = 5d;
    private double graphLastMagXValue = 5d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO make this onCreate method not suck and subclass graphs and series
        mGraphGyro = initGraph(R.id.graphGyro, "Sensor.TYPE_GYROSCOPE");
        mGraphAccel = initGraph(R.id.graphAccel, "Sensor.TYPE_ACCELEROMETER");
        mGraphGravity = initGraph(R.id.graphGravity, "Sensor.TYPE_GRAVITY");
        mGraphTemp = initGraph(R.id.graphTemp, "Sensor.TYPE_AMBIENT_TEMPERATURE");
        mGraphMag = initGraph(R.id.graphMag, "Sensor.TYPE_MAGNETIC_FIELD");

        //GYRO
        mSeriesGyroX = initSeries(Color.BLUE, "X");
        mSeriesGyroY = initSeries(Color.RED, "Y");
        mSeriesGyroZ = initSeries(Color.GREEN, "Z");

        mGraphGyro.addSeries(mSeriesGyroX);
        mGraphGyro.addSeries(mSeriesGyroY);
        mGraphGyro.addSeries(mSeriesGyroZ);



        // ACCEL
        mSeriesAccelX = initSeries(Color.BLUE, "X");
        mSeriesAccelY = initSeries(Color.RED, "Y");
        mSeriesAccelZ = initSeries(Color.GREEN, "Z");

        mGraphAccel.addSeries(mSeriesAccelX);
        mGraphAccel.addSeries(mSeriesAccelY);
        mGraphAccel.addSeries(mSeriesAccelZ);



        // Temp
        mSeriesTemp = initSeries(Color.RED, "Temp");
        mGraphTemp.addSeries(mSeriesTemp);



        // Magnatic
        mSeriesMagX = initSeries(Color.BLUE, "X");
        mSeriesMagY = initSeries(Color.RED, "Y");
        mSeriesMagZ = initSeries(Color.GREEN, "Z");

        mGraphMag.addSeries(mSeriesMagX);
        mGraphMag.addSeries(mSeriesMagY);
        mGraphMag.addSeries(mSeriesMagZ);


    }




}
