package puyue.cn.testlogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends BaseActivity implements OnClickListener,OnLongClickListener {
    // 声明控件对象
    private EditText et_name, et_pass;
    private Button mLoginButton,mLoginError,mRegister,ONLYTEST;
    int selectIndex=1;
    int tempSelect=selectIndex;
    boolean isReLogin=false;
    private int SERVER_FLAG=0;
    private RelativeLayout countryselect;
    private TextView   coutry_phone_sn, coutryName;//
    // private String [] coutry_phone_sn_array,coutry_name_array;
    public final static int LOGIN_ENABLE=0x01;    //注册完毕了
    public final static int LOGIN_UNABLE=0x02;    //注册完毕了
    public final static int PASS_ERROR=0x03;      //注册完毕了
    public final static int NAME_ERROR=0x04;      //注册完毕了

    final Handler UiMangerHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            // TODO Auto-generated method stub
            switch(msg.what){
                case LOGIN_ENABLE:
                    mLoginButton.setClickable(true);
//    mLoginButton.setText(R.string.login);
                    break;
                case LOGIN_UNABLE:
                    mLoginButton.setClickable(false);
                    break;
                case PASS_ERROR:

                    break;
                case NAME_ERROR:
                    break;
            }
            super.handleMessage(msg);
        }
    };
    private Button bt_username_clear;
    private Button bt_pwd_clear;
    private Button bt_pwd_eye;
    private TextWatcher username_watcher;
    private TextWatcher password_watcher;
}
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    EditText et=(EditText) findViewById(R.id.txt_tv);
    String str=et.getText().toString();
}
