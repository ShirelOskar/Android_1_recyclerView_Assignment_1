package com.example.thesmurfs.services;

import static android.provider.Settings.System.getString;
import android.app.SearchManager;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;
import com.example.thesmurfs.R;
import com.example.thesmurfs.R.*;
public class MyData {

    static String a = "Brainy Smurf considers himself the most intelligent Smurf in the village and an expert on everything, although his actual knowledge is questionable at best; often, his attempts to help in a given situation lead to even more problems, and the Smurfs often blame him on everything.";
    static String b = "He is a lovable smurf whose whole occupation is to prepare and eat different flavors and therefore he is a bit chubby. Knows many recipes by heart and cooks many dishes every day. Although the Smurfs are vegetarians, Glutton sometimes cooks meat dishes, although he apparently never does. wearing a chef's hat.";
static String c = "Clumsy Smurf is a somewhat dimwitted yet amiable Smurf. In some dangerous situations he is also revealed to be quite brave too. Despite his clumsiness, he finds himself always wanting to help others and usually looks on the bright side of things. He also ends up surprising himself and others when facing consequences.";
static String d= "Grouchy Smurf is the misanthropic grouch of the Smurf village. His catchphrase is \"I hate (something somebody else mentions)\" yet it is shown during the show that he is a good observer and notices kindness in others even if he is not playing active role in an event. Even though Grouchy Smurf portrays a role of a moaner within the group, he mostly wishes others to be happy and successful in order to get out of a problematic situation. ";
static String e = "Hefty Smurf has incredible strength and often is seen doing a lot of the heavy work in the village. He also has a tattoo on his right arm (or sometimes both of his arms) of a red heart with an arrow through it. His favorite activity is lifting weights and doing other forms of exercise, and is often the one to kick Brainy out of the village whenever he is boasting. Hefty takes pride in being tough, sometimes doing it just for attention.";
static String f = "Jokey is the village prankster. In both cartoon shows, Jokey almost always used the same form of \"joke\"; yellow- and red-wrapped present boxes that he offers to his victims, saying that it is a \"surprise\". When opened, the box explodes with a sizable quantity of black smoke which blackens the receiver's face (or entire body depending on the explosion's size)";

static  String g = "Lazy Smurf is the laziest of all the Smurfs. He spends almost all his time sleeping, either: in his bed, a hammock, on the grass, under a tree, or anywhere at any time day or night, even in the village’s well.";
static String j = "Scaredy Smurf easily gets scared by anything whether it is a small insect or the noise of a storm. He is often teased by the other Smurfs because of this.";
static String i = "Papa Smurf is the leader and elder of the Smurfs and can be easily distinguished by his red clothes, bushy white moustache and beard (though when he was younger, his moustache and beard were brown).Not only he is the leader of the Smurfs, he is also a wizard too where he works on a lot of spells and magic in his house. The Smurfs turn to Papa Smurf when things go wrong.";
static String h = "Painter Smurf the village’s artist and is active in most visual arts. He wears a red jacket with a black tie, and is often seen making a painting";

static String k = "Smurfette is a female Smurf who was created by Gargamel. She originally had black hair with an ugly appearance, but when Papa Smurf made her into a real Smurf, her hair became blonde with a beautiful appearance. Most of the time Smurfette is portrayed as an object of love, since her beauty attracts many other Smurfs. She is usually hopeless in times of danger and sometimes thinks she knows it all, yet she is kind, caring, sweet, and loving as well.";
    public static String[] nameArray = {"Brainy Smurf", "Chef Smurf", "Clumsy Smurf", "Grouchy Smurf", "Hefty Smurf", "Jokey Smurf", "Lazy Smurf","Painter Smurf", "Papa Smurf", "Scaredy Smurf", "Smurfette"};


    public static String[] describeArray = {a, b, c, d, e, f, g, h, i, j,k};




    public static Integer[] drawableArray = {drawable.brainysmurf2, drawable.chefsmurf1, drawable.clumsysmurf1,

            drawable.grouchysmurf1, drawable.heftysmurf1, drawable.jokeysmurf1, drawable.lazysmurf2,

            drawable.paintersmurf3, drawable.papasmurf1, drawable.scaredysmurf1, drawable.smurfette1};



    public static Integer[] id_ = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

}
