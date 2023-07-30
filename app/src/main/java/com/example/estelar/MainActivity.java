package com.example.estelar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image1 = findViewById(R.id.image1);
        ImageView image2 = findViewById(R.id.image2);
        ImageView image3 = findViewById(R.id.image3);
        ImageView image4 = findViewById(R.id.image4);

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondActivity(R.drawable.agujeronegro,"Agujero Negro\n" +
                        "Descripción: Un agujero negro es una región del espacio-tiempo donde la fuerza de gravedad es tan intensa que nada, ni siquiera la luz, puede escapar de su atracción. Se forman a partir del colapso gravitacional de estrellas masivas al final de su ciclo de vida, o por la fusión de agujeros negros más pequeños. La presencia de un agujero negro se caracteriza por su horizonte de eventos, una frontera invisible más allá de la cual nada puede regresar. A pesar de su nombre, un agujero negro no es un \"agujero\" en el sentido convencional, sino una concentración masiva extremadamente densa con efectos extraordinarios en el espacio circundante, distorsionando la luz y el tiempo a su alrededor.");
            }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondActivity(R.drawable.aurorapolar,"Auroras Polares\n" +
                        "Descripción: Las auroras polares, también conocidas como las luces del norte (aurora boreal) y las luces del sur (aurora austral), son fenómenos naturales que ocurren en las regiones polares de la Tierra. Son causadas por partículas cargadas del viento solar (principalmente electrones y protones) que interactúan con la magnetosfera terrestre y la atmósfera superior. Estas partículas energéticas son canalizadas hacia los polos por el campo magnético terrestre. Cuando colisionan con los átomos y moléculas en la atmósfera, se produce una excitación que emite luz, creando cortinas, arcos y remolinos de colores en el cielo nocturno. Los colores más comunes en una aurora incluyen el verde y el rojo, dependiendo del tipo de átomos involucrados en la interacción. Las auroras polares son un espectáculo impresionante y etéreo que ha asombrado a las culturas a lo largo de la historia y que inspira admiración y estudio en la ciencia moderna.");
            }
        });

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondActivity(R.drawable.nebulosa,"Nebulosa\n" +
                        "Descripción: Una nebulosa es una vasta región interestelar compuesta principalmente por gas (hidrógeno, helio y trazas de otros elementos) y polvo cósmico. Estas nubes gigantes y coloridas son el lugar de nacimiento y muerte de las estrellas. Las nebulosas pueden clasificarse en diferentes tipos según su apariencia y origen. Las nebulosas de emisión son iluminadas por estrellas jóvenes y masivas, mientras que las nebulosas de reflexión reflejan la luz de estrellas cercanas. Las nebulosas oscuras son densas y opacas, bloqueando la luz de estrellas y objetos más allá de ellas. Las nebulosas planetarias son el resultado de la expulsión de capas exteriores de una estrella moribunda. Estas formaciones cósmicas, a menudo bellas y exóticas, ofrecen una ventana única para estudiar la evolución estelar y la química del Universo.");
            }
        });

        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondActivity(R.drawable.lluviameteoritos,"Lluvia de Meteoritos\n" +
                        "Descripción: Una lluvia de meteoritos, también conocida como lluvia de estrellas, es un evento astronómico en el cual una gran cantidad de meteoritos (pequeñas partículas de polvo y roca del espacio) ingresan a la atmósfera de la Tierra y se desintegran, creando destellos brillantes de luz mientras atraviesan la atmósfera terrestre. Estos meteoritos son remanentes de cometas y asteroides que dejan tras de sí una estela de escombros en su órbita alrededor del Sol. Cuando la Tierra atraviesa esta corriente de partículas, la fricción con la atmósfera provoca que se calienten y brillen en el cielo, ofreciendo un espectáculo cautivador y efímero que ha fascinado a los observadores del cielo a lo largo de la historia.");
            }
        });
    }

    private void openSecondActivity(int imageResId, String description) {
        Intent intent = new Intent(this, secondActivity.class);
        intent.putExtra("imageResId", imageResId);
        intent.putExtra("description", description);
        startActivity(intent);
    }
}