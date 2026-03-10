package edu.kis.powp.jobs2d.drivers.adapter;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DriverFeature;

public class FiguresJaneDriverAdapter extends edu.kis.powp.jobs2d.AbstractDriver {

    private final Job2dDriver job2dDriver;

    public FiguresJaneDriverAdapter() {
        super(0, 0);
        job2dDriver = DriverFeature.getDriverManager().getCurrentDriver();
    }

    @Override
    public void operateTo(int x, int y) {
        job2dDriver.operateTo(x, y);
    }
}