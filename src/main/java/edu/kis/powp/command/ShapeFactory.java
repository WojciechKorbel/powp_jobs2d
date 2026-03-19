package edu.kis.powp.command;


public class ShapeFactory {
    public static ComplexCommand createRectangle(int x, int y, int w, int h) {
        ComplexCommand commands = new ComplexCommand();
        commands.addCommand(new SetPositionCommand(x, y));
        commands.addCommand(new OperateToCommand(x + w, y));
        commands.addCommand(new OperateToCommand(x + w, y + h));
        commands.addCommand(new OperateToCommand(x, y + h));
        commands.addCommand(new OperateToCommand(x, y));
        return commands;
    }

    public static ComplexCommand createPolygon(int[] xPoints, int[] yPoints) {
        ComplexCommand commands = new ComplexCommand();

        if (xPoints.length == 0) {
            return commands;
        }
        if (xPoints.length != yPoints.length){
            return commands;
        }

        commands.addCommand(new SetPositionCommand(xPoints[0], yPoints[0]));

        for (int i = 1; i < xPoints.length; i++) {
            commands.addCommand(new OperateToCommand(xPoints[i], yPoints[i]));
        }
        commands.addCommand(new OperateToCommand(xPoints[0], yPoints[0]));
        return commands;
    }
}
