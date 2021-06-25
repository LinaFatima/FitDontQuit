package com.example.fitdontquit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class WorkoutsActivity extends AppCompatActivity {
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workouts);
        getSupportActionBar().hide();
        img=findViewById(R.id.imgBack);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),HomeScreen.class);
                startActivity(intent);
            }
        });

    }

    public void buttonMountain(View view)
    {
        Intent i=new Intent(getApplicationContext(), StartMountainClimbing.class);
        i.putExtra("Name", "Mountain Climbing");
        i.putExtra("Details", "Put both hands and knees on the floor. Place your right foot near your right hand and extend your left leg behind you.In one smooth motion, switch your legs, keeping your arms in the same position. Switch your legs back and forth twice, such that your right leg is again close to your right hand. ");
        i.putExtra("resId",R.drawable.exersice_1);
        startActivity(i);
    }
    public void buttonBasicCrun(View view)
    {
        Intent i=new Intent(getApplicationContext(), StartMountainClimbing.class);
        i.putExtra("Name","Basic Crunches");
        i.putExtra("Details", "Lie down on your back. Plant your feet on the floor, hip-width apart. Bend your knees and place your arms across your chest.");
        i.putExtra("resId",R.drawable.exersice_2);
        startActivity(i);
    }
    public void buttonBenchDips(View view)
    {
        Intent i=new Intent(getApplicationContext(), StartMountainClimbing.class);
        i.putExtra("Name","Bench Dips");
        i.putExtra("Details", "Firmly grip the edge of the bench as you straighten your arms and extend your legs forward so that your knees are no longer bent.");
        i.putExtra("resId",R.drawable.exersice_3);
        startActivity(i);
    }
    public void buttonBicycle(View view)
    {
        Intent i=new Intent(getApplicationContext(), StartMountainClimbing.class);
        i.putExtra("Name","Bicycle Crunches");
        i.putExtra("Details", "Lie flat on the floor with your lower back pressed to the ground (pull your navel in to also target your deep abs).\n" +
                "Put your hands behind your head, then bring your knees in towards your chest and lift your shoulder blades off the ground");
        i.putExtra("resId",R.drawable.exersice_4);
        startActivity(i);
    }
    public void LegRaise(View view)
    {
        Intent i=new Intent(getApplicationContext(), StartMountainClimbing.class);
        i.putExtra("Name","Leg Raise");
        i.putExtra("Details", "Lie on your back, legs straight and together. Keep your legs straight and lift them all the way up to the ceiling until your butt comes off the floor. Slowly lower your legs back down till they’re just above the floor. Hold for a moment. Raise your legs back up. Repeat.");
        i.putExtra("resId",R.drawable.exersice_5);
        startActivity(i);
    }
    public void SitUp(View view)
    {
        Intent i=new Intent(getApplicationContext(), StartMountainClimbing.class);
        i.putExtra("Name","Sit Ups");
        i.putExtra("Details", "Lie on the floor facing the ceiling with a slight bend in your knees and arms bent at the elbows and hands lightly touching your head by the ears. Engage your core and lift your upper body so your right elbow touches your left knee Return to the start position then lift your upper body so your left elbow touches your right knee.");
        i.putExtra("resId",R.drawable.exersice_8);
        startActivity(i);
    }
    public void vUps(View view)
    {
        Intent i=new Intent(getApplicationContext(), StartMountainClimbing.class);
        i.putExtra("Name","Alternate V Ups");
        i.putExtra("Details", "Get in a high pushup position.\n" +
                "Keep your arms and body straight and lift your left leg and drive your knee to your torso.\n" +
                "Reverse and return to the starting position. Repeat with the right leg.");
        i.putExtra("resId",R.drawable.exersice_9);
        startActivity(i);
    }
    public void PlankRotation(View view)
    {
        Intent i=new Intent(getApplicationContext(), StartMountainClimbing.class);
        i.putExtra("Name","Plank Rotation");
        i.putExtra("Details", "Start in a traditional side plank position. Raise your top arm straight above you. Then lower your arm and rotate your core as you thread your top arm through the space under you. .");
        i.putExtra("resId",R.drawable.exersice_10);
        startActivity(i);
    }
    public void PlankLeftLeg(View view)
    {
        Intent i=new Intent(getApplicationContext(), StartMountainClimbing.class);
        i.putExtra("Name","Plank Left Leg");
        i.putExtra("Details", "Start in plank position with hands shoulder-width apart. Your shoulders, hips, and ankles should be in a line. Keep abs engaged and raise right leg off the floor until it’s at about hip height. Keep right foot flexed.");
        i.putExtra("resId",R.drawable.exersice_11);
        startActivity(i);
    }
    public void RussianTwist(View view)
    {
        Intent i=new Intent(getApplicationContext(), StartMountainClimbing.class);
        i.putExtra("Name","Russian Twist");
        i.putExtra("Details", "press your feet into the floor or extend them straight out as you get a feel for the movement. Breathe steadily and deeply. Exhale with each twist, and inhale to return to the center. ");
        i.putExtra("resId",R.drawable.exersice_12);
        startActivity(i);
    }
    public void Bridge(View view)
    {
        Intent i=new Intent(getApplicationContext(), StartMountainClimbing.class);
        i.putExtra("Name","Bridge");
        i.putExtra("Details", "Start by lying flat on your back on a yoga mat. Bend your knees and position your feet firmly on the mat. Allow your arms to rest by your sides on the mat. This is your starting position.Press your heels into the mat, activate your glutes and raise your pelvis off the floor until your body forms one straight line from chin to knee, resting on your shoulders.");
        i.putExtra("resId",R.drawable.exersice_13);
        startActivity(i);
    }
    public void Vertica(View view)
    {
        Intent i=new Intent(getApplicationContext(), StartMountainClimbing.class);
        i.putExtra("Name","Vertica Leg Crunches");
        i.putExtra("Details", "Start the exercise by lying down, extending your legs, and pointing your toes upward to form a straight line with your body. Relax your shoulders and neck and find a comfortable position.");
        i.putExtra("resId",R.drawable.exersice_14);
        startActivity(i);
    }
    public void AlternativeHeelTouch(View view)
    {
        Intent i=new Intent(getApplicationContext(), StartMountainClimbing.class);
        i.putExtra("Name","Alternative Heel Touch");
        i.putExtra("Details", "Bend your knees and position your feet firmly on the mat hip-width apart. Slowly lift your head and shoulder blades and arms off the floor and gently draw your ribs to your hips to engage your core. This is your starting position. Bend your torso to the right to allow your right hand to touch your right ankle.");
        i.putExtra("resId",R.drawable.exersice_6);
        startActivity(i);
    }
    public void WindMill(View view)
    {
        Intent i=new Intent(getApplicationContext(), StartMountainClimbing.class);
        i.putExtra("Name","Wind Mill");
        i.putExtra("Details", "Stand with your feet slightly wider than shoulder-width apart. Turn the toes of your left foot straight to the side at 90 degrees. Reach your right arm up to the ceiling and let your left hand hang down at your side. Look up at your right hand.");
        i.putExtra("resId",R.drawable.exersice_15);
        startActivity(i);
    }
    public void LegUpCrunches(View view)
    {
        Intent i=new Intent(getApplicationContext(), StartMountainClimbing.class);
        i.putExtra("Name","Leg Up Crunches");
        i.putExtra("Details", "Start lying on your back with bent knees and your hands behind your head. Lift your head, neck and shoulders off the ground by contracting your abdominal muscles. At the same time, lift one bent knee up until your thigh is perpendicular to the floor.Extend your leg as you slowly lower your upper body back down, then repeat.");
        i.putExtra("resId",R.drawable.exersice_7);
        startActivity(i);
    }
}
