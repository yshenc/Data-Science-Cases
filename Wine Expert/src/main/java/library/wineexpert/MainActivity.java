package library.wineexpert;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{

    Button Log;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log=(Button)this.findViewById(R.id.login);
        Log.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        int id=v.getId();
        if (id==R.id.login){
            Intent intent = new Intent(this, firstpage.class);
            this.startActivity(intent);
        }
    }
}

