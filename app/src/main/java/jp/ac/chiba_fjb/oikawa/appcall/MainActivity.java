package jp.ac.chiba_fjb.oikawa.appcall;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//以下の呼び出し内容を表示する
// http://join/id=パラメータ

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Intent intent = getIntent();
		if(intent != null && intent.getDataString() != null){
			Pattern p = Pattern.compile("id=(.*)");
			Matcher m = p.matcher(intent.getDataString());
			if(m.find())
				((TextView)findViewById(R.id.textView1)).setText(m.group(1));
		}

	}

}
