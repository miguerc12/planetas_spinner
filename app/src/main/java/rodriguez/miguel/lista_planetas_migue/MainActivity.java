package rodriguez.miguel.lista_planetas_migue;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Spinner planetSpinner;
    private ImageView planetImage;
    private TextView planetDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        planetSpinner = findViewById(R.id.planet_spinner);
        planetImage = findViewById(R.id.planet_image);
        planetDescription = findViewById(R.id.planet_description);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        planetSpinner.setAdapter(adapter);

        planetSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedPlanet = parent.getItemAtPosition(position).toString();
                displayPlanetInfo(selectedPlanet);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void displayPlanetInfo(String planet) {

        switch (planet) {
            case "Mercurio":
                planetImage.setImageResource(R.drawable.img);
                planetDescription.setText(getString(R.string.mercury_description));
                break;
            case "Venus":
                planetImage.setImageResource(R.drawable.img_1);
                planetDescription.setText(getString(R.string.venus_description));
                break;
            case "Tierra":
                planetImage.setImageResource(R.drawable.img_2);
                planetDescription.setText(getString(R.string.earth_description));
                break;
            case "Marte":
                planetImage.setImageResource(R.drawable.img_3);
                planetDescription.setText(getString(R.string.mars_description));
                break;
            case "Júpiter":
                planetImage.setImageResource(R.drawable.img_4);
                planetDescription.setText(getString(R.string.jupiter_description));
                break;
            case "Saturno":
                planetImage.setImageResource(R.drawable.img_5);
                planetDescription.setText(getString(R.string.saturn_description));
                break;
            case "Urano":
                planetImage.setImageResource(R.drawable.img_6);
                planetDescription.setText(getString(R.string.uranus_description));
                break;
            case "Neptuno":
                planetImage.setImageResource(R.drawable.img_7);
                planetDescription.setText(getString(R.string.neptune_description));
                break;
        }
    }
}
