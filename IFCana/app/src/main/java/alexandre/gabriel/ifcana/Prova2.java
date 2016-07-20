package alexandre.gabriel.ifcana;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Gabriel on 08/07/2016.
 */
public class Prova2 extends AppCompatActivity {

    private Button proxima_prova2;
    private ImageView bt_voltar;


    @Override
    protected void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);
        setContentView(R.layout.tela_prova2);

        proxima_prova2 = (Button) findViewById(R.id.btprova2);
        proxima_prova2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent trocatela = new
                Intent(Prova2.this, Prova3.class);
                Prova2.this.startActivity(trocatela);
                Prova2.this.finish();

            }
        });

        bt_voltar = (ImageView) findViewById(R.id.btvoltar);
        bt_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trocatela = new Intent(Prova2.this, Prova1.class);
                Prova2.this.startActivity(trocatela);
                Prova2.this.finish();

            }

        });
    }
    
}
