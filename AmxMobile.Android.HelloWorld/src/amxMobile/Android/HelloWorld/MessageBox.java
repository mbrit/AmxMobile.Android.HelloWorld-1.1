package amxMobile.Android.HelloWorld;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class MessageBox {

	public static void Show(Activity owner, String message)
	{
		AlertDialog.Builder builder = new AlertDialog.Builder(owner);
		builder.setTitle(R.string.app_name);
		builder.setMessage(message);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                // do something here..
            }
        });
		
		// show...
		AlertDialog dialog = builder.create();
		dialog.show();
	}
}
