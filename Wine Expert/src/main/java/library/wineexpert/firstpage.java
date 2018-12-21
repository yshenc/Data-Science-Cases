package library.wineexpert;

/**
 * Created by shenyuchen on 17/12/6.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class firstpage extends Activity implements OnClickListener{

    Button Wine,History,Account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_layout);
        Wine=(Button)this.findViewById(R.id.Wine_btn);
        Wine.setOnClickListener(this);
        History=(Button)this.findViewById(R.id.History_btn);
        History.setOnClickListener(this);
        Account=(Button)this.findViewById(R.id.Account_btn);
        Account.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        int id=v.getId();
        if (id==R.id.Wine_btn){
            Intent intent = new Intent(this, searchpage.class);
            this.startActivity(intent);
        }else if (id==R.id.History_btn){
            Intent intent = new Intent(this, historypage.class);
            this.startActivity(intent);
        }
    }
}