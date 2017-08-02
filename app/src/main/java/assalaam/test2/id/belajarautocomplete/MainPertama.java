package assalaam.test2.id.belajarautocomplete;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPertama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pertama);

        Button next = (Button) findViewById(R.id.pertama);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), MainKedua.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
