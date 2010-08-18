package amxMobile.Android.HelloWorld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MyHelloWorldActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // initialize the UI...
        setContentView(R.layout.main);
        
        // wire up a the button...
        Button button = this.getButton(); 
        button.setOnClickListener(this);
    }
    
    private Button getButton()
    {
    	return (Button)findViewById(R.id.buttonGo);
    }
    
	public void onClick(View v)
	{
		if(v.getId() == R.id.buttonGo)
		{
			// that's our cue...
			MessageBox.Show(this, "Hello, world!");
		}
	}
}