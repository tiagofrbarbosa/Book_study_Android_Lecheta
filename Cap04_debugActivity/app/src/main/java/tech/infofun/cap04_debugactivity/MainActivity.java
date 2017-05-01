package tech.infofun.cap04_debugactivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btLogin = (Button) findViewById(R.id.btLogin);

        btLogin.setOnClickListener(onClickLogin());
    }

    private View.OnClickListener onClickLogin(){
        return new View.OnClickListener(){

            @Override
            public void onClick(View v){
                TextView tLogin = (TextView) findViewById(R.id.tLogin);
                TextView tSenha = (TextView) findViewById(R.id.tSenha);

                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();

                if("ricardo".equals(login) && "123".equals(senha)){
                    Intent intent = new Intent(getContext(), BemVindoActivity.class);
                    Bundle params = new Bundle();
                    params.putString("nome", "Ricardo Lecheta");
                    intent.putExtras(params);
                    startActivity(intent);
                }else{
                    alert("Login ou senha incorretos.");
                }
            }
        };
    }

    private Context getContext(){
        return this;
    }

    private void alert(String s){
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }
}
