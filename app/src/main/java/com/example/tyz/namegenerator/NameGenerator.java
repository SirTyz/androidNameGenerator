package com.example.tyz.namegenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

import java.util.Random;
import java.util.StringTokenizer;

public class NameGenerator extends AppCompatActivity {

    int oldFRand = 0;
    int oldLRand = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_generator);

        final TextView textView = (TextView) findViewById(R.id.textView1);
        Button button = (Button) findViewById(R.id.button);
        final String[] firstName = {
                "Tyler",
                "Hanna",
                "Austin",
                "Nicole",
                "Bjorn",
                "Thomas",
                "Till",
                "Silvester",
                "Lucas",
                "George",
                "Axel",
                "Tillmann",
                "Alexander",
                "Ludwig",
                "Ustin",
                "Maxim",
                "Stefan",
                "Bogdan",
                "Luka",
                "Otbert",
                "Vigor",
                "Thegan",
                "Garivald",
                "Fulrad",
                "Razo",
                "Wulfram",
                "Leuthard",
                "Turpin",
                "Otto",
                "Fulk",
                "Hubert",
                "Clovis",
                "Odo",
                "Anno",
                "Karlmann",
                "Anskar",
                "Folmar",
                "Tihomir",
                "Vlad",
                "Wella",
                "Gunteric",
                "Colias",
                "Rikiar",
                "Galindus",
                "Mundo",
                "Alaric",
                "Aligern",
                "Rodolf",
                "Eberwolf",
                "Salla",
                "Borani",
                "Bilimer",
                "Duda",
                "Agila",
                "Totila",
                "Odoin",
                "Huml",
                "Ibba",
                "Ovida",
                "Saphrax",
                "Dins",
                "Salvis",
                "Albins",
                "Egils",
                "Nocler",
                "Zuba",
                "Fograal",
                "Odlec",
                "Sokolt",
                "Kralca",
                "Stutra",
                "Muallor",
                "Dizoc",
                "Koveen",
                "Liazu",
                "Enad",
                "Suneld",
                "Derkay",
                "Asrall",
                "Kraice",
                "Dobroka",
                "Stilmul",
                "Enza",
                "Logac",
                "Okeak",
                "Aryer",
                "Hendla",
                "Drurna",
                "Thaiva",
                "Marua",
                "Kriskar",
                "Bultalt",
                "Chatar",
                "Drimi",
                "Geiblor",
                "Cothmand",
                "Dulwal",
                "Strizast",
                "Ebe",
                "Tholuk",
                "Tilcas",
                "Undlo",
                "Nultad",
                "Bruson",
                "Gritri"
        };

        final String[] lastName = {
                "Cox",
                "Scoggins",
                "Lemaster",
                "Morris",
                "Wolfsohn",
                "Gerster",
                "Korsch",
                "Beer",
                "Heidler",
                "Strier",
                "Teyber",
                "Traub",
                "Dorn",
                "Wernz",
                "Hersh",
                "Wexner",
                "Scheck",
                "Hopfer",
                "Hoger",
                "Hagel",
                "Scheck",
                "Drossel",
                "Voigt",
                "Horstmann",
                "Martin",
                "Apel",
                "Ober",
                "Schultz",
                "Heller",
                "Heim",
                "Dahmen",
                "Rosin",
                "Wahl",
                "Mayr",
                "Steinberg",
                "Denker",
                "Haass",
                "Elser",
                "Blatt",
                "Dullum",
                "Norberg",
                "Baardsen",
                "Vee",
                "Salmonsen",
                "Ohlsen",
                "Opsal",
                "Danielsen",
                "Lovland",
                "Jorstad",
                "Ulberg",
                "Lybeck",
                "Underberg",
                "Asplund",
                "Nystrom",
                "Backer",
                "Sabo",
                "Selvig",
                "Overbey",
                "Bentzen",
                "Hamar",
                "Jorde",
                "Arvesen",
                "Helland",
                "Haarstad",
                "Bjorgen",
                "Ulven",
                "Bjelland",
                "Solem",
                "Sund"
        };

        final String[] suffix = {
                "the Shackled",
                "the Lonely",
                "the Ambitious",
                "the Small",
                "the Giant",
                "the Weak",
                "the Meek",
                "the Righteous",
                "the Young",
                "the Fat",
                "the Cold",
                "the Bloody",
                "the Ill",
                "the Coward",
                "the Silent",
                "of Oakburn",
                "of Karmswald",
                "of The Reich",
                "of Faykeep",
                "of Westerheim",
                "of the Barrows",
                "of Allenfel",
                "of the Chase",
                "of Ernst",
                "of the Hills",
                "of Bellagin",
                "of Oftburg",
                "of Thurderry",
                "of the Ward",
                "the Civilized",
                "of Hooftheim",
                "the Plauged",
                "the Cleaver",
                "the Fleshling",
                "the Mongrel",
                "the Wyrm",
                "of the Crow",
                "the Tongue Splitter",
                "the Charming",
                "the Acolyte",
                "the Betrothed",
                "the Liar",
                "the Keeper",
                "of the Void",
                "the Old",
                "the Blind",
                "the Gored",
                "Toad-Bane",
                "Toad-Bane",
                "the Forgivable",
                "the Splintered",
                "the Keeper of Lies",
                "the Drowning God",
                "the Swine",
                "of the Wilds",
                "Thrice-Burried",
                "the Breath of the Gods",
                "the Cherished",
                "the Vulgar",
                "the Invincible",
                "the Blasphemer",
                "the Unbroken",
                "the Unshackeled",
                "the Mad",
                "the Seer",
                "Black-Lungs",
                "the Long Traveled",
                "the Weary",
                "of the Fourth Blight",
                "of the Final Hour",
                "of the First Hour",
                "the First Born",
                "the Last Born",
                "the Elder",
                "the Senseless",
                "the Reader",
                "the Dark",
                "the Enlightened",
                "the Dull",
                "follower of Kor",
                "of the Tweleve",
                "the First",
                "the Second",
                "the Third",
                "the Fourth",
                "the Fifth",
                "the Sixth",
                "the Godless",
                "the Hefty",
                "the Contagious",
                "the Inverted",
                "the Vessel",
                "the Pastel",
                "Pact-Bound",
                "of Woe",
                "the Herald",
                "the Cursed",
                "the Crimson",
                "the White",
                "the Black"
        };

        final String[] prefix = {
                "Master",
                "Protector",
                "Tribune",
                "Saint",
                "Assistant",
                "Earl",
                "Prime",
                "Chaplain",
                "Templar",
                "Professor",
                "Assistant",
                "Librarian",
                "Sir",
                "Lord",
                "Imperator",
                "Governor",
                "Prince",
                "Corporal",
                "General",
                "Commander",
                "Exarch"

        };


        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int fRand = (int) (Math.random() * firstName.length);
                int lRand = (int) (Math.random() * lastName.length);
                int sRand = (int) (Math.random() * suffix.length);
                int pRand = (int) (Math.random() * prefix.length);

                int rand1 = (int) (Math.random() * 100);
                int rand2 = (int) (Math.random() * 100);

                if(fRand == oldFRand) {
                    fRand = (int) (Math.random() * firstName.length);
                }
                else if(lRand == oldLRand) {
                    lRand = (int) (Math.random() * lastName.length);
                }

                //Checks to see if suffix should be added.
                if (rand1 <= 5) {
                    //Checks to see if prefix should be added.
                    if (rand2 <=10) {
                        textView.setText(prefix[pRand] + " " + firstName[fRand] + " " + lastName[lRand] + " " + suffix[sRand]);
                    }
                    textView.setText(firstName[fRand] + " " + lastName[lRand] + " " + suffix[sRand]);
                }
                //Checks to see if prefix should be added.
                else if (rand2 <= 10) {
                    textView.setText(prefix[pRand] + " " + firstName[fRand] + " " + lastName[lRand]);
                }
                else {
                    textView.setText(firstName[fRand] + " " + lastName[lRand]);
                }
                oldFRand = fRand;
                oldLRand = lRand;
            }

        });
    }
}
