package assalaam.test2.id.belajarautocomplete;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button next = (Button) findViewById(R.id.Linear);
        next.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek) {
                Intent myIntent = new
                Intent (bebek.getContext(),LinearLayoutSederhana.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button aa = (Button) findViewById(R.id.Relative);
        aa.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek) {
                Intent myIntent = new
                Intent (bebek.getContext(),RelativeLayoutSederhana.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button bb = (Button) findViewById(R.id.Table);
        bb.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent (bebek.getContext(),LayoutTable.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button cc = (Button) findViewById(R.id.Autocomplete);
        cc.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent (bebek.getContext(),AutocompleteSederhana.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button dd = (Button) findViewById(R.id.Dialog);
        dd.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent (bebek.getContext(),KotakDialog.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button ee = (Button) findViewById(R.id.Picker);
        ee.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent (bebek.getContext(),picker.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button ff = (Button) findViewById(R.id.CheckBox);
        ff.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent (bebek.getContext(),checkBox.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button gg = (Button) findViewById(R.id.Radio);
        gg.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent (bebek.getContext(), android.widget.RadioButton.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button hh = (Button) findViewById(R.id.ListView);
        hh.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent (bebek.getContext(),seleksi.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button ii = (Button) findViewById(R.id.Gambar);
        ii.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent (bebek.getContext(),TampilanGambar.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button jj = (Button) findViewById(R.id.activity_playing_audio);
        jj.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent (bebek.getContext(),playingAudio.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
