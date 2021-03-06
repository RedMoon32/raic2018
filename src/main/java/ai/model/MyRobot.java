package ai.model;

import model.Action;
import model.Robot;

/**
 * By no one on 22.12.2018.
 */
public class MyRobot extends Entity {
//    public int id;
//    public int player_id;
//    public boolean is_teammate;
    public boolean touch;

    public Action action;
    public Vector3d touch_normal;
    public double nitro;

    public Robot toRobot(int id, int player_id, boolean isTeammate) {
        Robot r = new Robot();
        r.id = id;
        r.player_id = player_id;
        r.is_teammate = isTeammate;

        r.nitro_amount = nitro;

        r.radius = radius;
        r.touch_normal_x = touch_normal.dx;
        r.touch_normal_y = touch_normal.dy;
        r.touch_normal_z = touch_normal.dz;

        r.x = position.x;
        r.y = position.y;
        r.z = position.z;

        r.velocity_x = velocity.dx;
        r.velocity_y = velocity.dy;
        r.velocity_z = velocity.dz;

        return r;
    }
}
