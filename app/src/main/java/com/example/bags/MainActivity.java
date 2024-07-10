//package com.example.bags;
//
//import android.annotation.SuppressLint;
//import android.content.DialogInterface;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//
//import androidx.activity.EdgeToEdge;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//    private TextView name, composition, price;
//    private Button button;
//    private static final List<Menu> menuZakuskaList = new ArrayList<>();
//    private static final List<Menu> menuSalatsList = new ArrayList<>();
//    private int randomNumber;
//
//    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        menuZakuskaList.add(new Menu("МАЛА СИРНА ТАРІЛКА", "добродар, чедер, дорблю, камамбер, сухофрукти, мед", "175"));
//        menuZakuskaList.add(new Menu("ВЕЛИКА СИРНА ТАРІЛКА", "гауда, бринза, добродар, чедер, дорблю, камамбер, сухофрукти, волоські горіхи, мед", "295"));
//        menuZakuskaList.add(new Menu("МАЛЕ ПЛАТО СИРОВ'ЯЛЕНЕ", "салямі, махан, філе птиці, м'ясний коктейль", "235"));
//        menuZakuskaList.add(new Menu("ВЕЛИКЕ ПЛАТО СИРОВ'ЯЛЕНЕ", "кабаноси, бастурма, салямі, махан, філе птиці, м'ясний коктейль", "325"));
//        menuZakuskaList.add(new Menu("СИР ФРІ", "сир чедер в хрусткій паніровці з журавлиним соусом", "145"));
//        menuZakuskaList.add(new Menu("КУРЯЧІ НАГЕТСИ", "подається з соусом BBQ", "155"));
//        menuZakuskaList.add(new Menu("ГІРЧИЧНО-МЕДОВІ КУРЯЧІ КРИЛЬЦЯ", "подаються з кисло-солодким соусом", "175"));
//        menuZakuskaList.add(new Menu("КУРЯЧІ КЕБАБЧИКИ", "в хрусткій паніровці, аджика", "175"));
//        menuZakuskaList.add(new Menu("ГАРЯЧЕ ПЛАТО", "мітболи, нагетси, моцарела та печериці фрі, соус ", "345"));
//        menuZakuskaList.add(new Menu("ПИВНА ДОШКА M", "чіпси Pringles, філе птиці, сулугуні, арахіс", "195"));
//        menuZakuskaList.add(new Menu("ПИВНА ДОШКА L", "мисливські ковбаски, моцарела фрі, мітболи, махан, сулугуні, соус", "295"));
//        menuZakuskaList.add(new Menu("ПИВНА ДОШКА XL", "кабаноси, бастурма, курячі крильця, мисливські ковбаски, печериці фрі, картопляні скибки, арахіс, соус ", "365"));
//        menuZakuskaList.add(new Menu("ЧIПCИ PRINGLES", "чіпси", "95"));
//
//        menuSalatsList.add(new Menu("ЦЕЗАР З КУРЯЧИМ ФІЛЕ", "", "175"));
//        menuSalatsList.add(new Menu("ТЕПЛИЙ САЛАТ З ТЕЛЯТИНОЮ ТА ЖУРАВЛИННИМ СОУСОМ", "", "195"));
//        menuSalatsList.add(new Menu("ОЛІВ'Є З ІНДИЧКОЮ", "", "135"));
//        menuSalatsList.add(new Menu("ТЕПЛИЙ САЛАТ З ПЕЧІНКОЮ ТА ПЕРЕПЕЛИНИМИ ЯЙЦЯМИ", "", "175"));
//        menuSalatsList.add(new Menu("САЛАТ З ПРОШУТТО ТА ГРУШЕЮ", "", "175"));
//        menuSalatsList.add(new Menu("ГРЕЦЬКИЙ", "", "155"));
//
//
//        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
//
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//
//        name = findViewById(R.id.name);
//        composition = findViewById(R.id.composition);
//        price = findViewById(R.id.price);
//        button = findViewById(R.id.button);
//
//
//        List<Integer> usedNumbers = new ArrayList<Integer>();
//        Random random = new Random();
//
//        int min = 0;
//        int max = 12;
//        for (int i = 0; i < menuZakuskaList.size(); i++) {
//            randomNumber = random.nextInt(max - min + 1) + min;
//            if (usedNumbers.contains(randomNumber)) {
//                i--;
//            } else {
//                usedNumbers.add(randomNumber);
//
//                name.setText("Назва: " + menuZakuskaList.get(randomNumber).getName());
//                composition.setText("Склад: ");
//                price.setText("Ціна: ");
//                button.setOnClickListener(this);
//            }
//        }
//    }
//
//    @Override
//    public void onClick(View view) {
//        if (view.getId()==R.id.button) {
//            composition.setText("Склад: " + menuZakuskaList.get(randomNumber).getComposition());
//            price.setText("Ціна: " + menuZakuskaList.get(randomNumber).getPrice());
//            view.setOnClickListener(clickListener(view));
//        }
//    }
//
//    private View.OnClickListener clickListener(View view){
//            View.OnClickListener click = new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    if (view.getId()==R.id.button) {
//                        onResume();
//                    }
//            }};
//                return click;
//    }
//
//}


package com.example.bags;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView name, composition, price;
    private Button button;
    private static final List<Menu> menuList = new ArrayList<>();

    private int randomNumber;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        menuList.add(new Menu("МАЛА СИРНА ТАРІЛКА", "добродар, чедер, дорблю, камамбер, сухофрукти, мед", "175"));
        menuList.add(new Menu("ВЕЛИКА СИРНА ТАРІЛКА", "гауда, бринза, добродар, чедер, дорблю, камамбер, сухофрукти, волоські горіхи, мед", "295"));
        menuList.add(new Menu("МАЛЕ ПЛАТО СИРОВ'ЯЛЕНЕ", "салямі, махан, філе птиці, м'ясний коктейль", "235"));
        menuList.add(new Menu("ВЕЛИКЕ ПЛАТО СИРОВ'ЯЛЕНЕ", "кабаноси, бастурма, салямі, махан, філе птиці, м'ясний коктейль", "325"));
        menuList.add(new Menu("СИР ФРІ", "сир чедер в хрусткій паніровці з журавлиним соусом", "145"));
        menuList.add(new Menu("КУРЯЧІ НАГЕТСИ", "подається з соусом BBQ", "155"));
        menuList.add(new Menu("ГІРЧИЧНО-МЕДОВІ КУРЯЧІ КРИЛЬЦЯ", "подаються з кисло-солодким соусом", "175"));
        menuList.add(new Menu("КУРЯЧІ КЕБАБЧИКИ", "в хрусткій паніровці, аджика", "175"));
        menuList.add(new Menu("ГАРЯЧЕ ПЛАТО", "мітболи, нагетси, моцарела та печериці фрі, соус ", "345"));
        menuList.add(new Menu("ПИВНА ДОШКА M", "чіпси Pringles, філе птиці, сулугуні, арахіс", "195"));
        menuList.add(new Menu("ПИВНА ДОШКА L", "мисливські ковбаски, моцарела фрі, мітболи, махан, сулугуні, соус", "295"));
        menuList.add(new Menu("ПИВНА ДОШКА XL", "кабаноси, бастурма, курячі крильця, мисливські ковбаски, печериці фрі, картопляні скибки, арахіс, соус ", "365"));
        menuList.add(new Menu("ЧIПCИ PRINGLES", "чіпси", "95"));

        menuList.add(new Menu("ЦЕЗАР З КУРЯЧИМ ФІЛЕ", "мікс салату, куряче філе, помідори чері, соус цезар, сир пармезан", "175"));
        menuList.add(new Menu("ТЕПЛИЙ САЛАТ З ТЕЛЯТИНОЮ ТА ЖУРАВЛИННИМ СОУСОМ", "мікс капусти, помідори чері, соус журавлиний, соус італійський, соус бальзамічний, сир пармезан", "195"));
        menuList.add(new Menu("ОЛІВ'Є З ІНДИЧКОЮ", "картопля, цибуля, морква, куряче яйце, індиче філе, солоні огірки, зелений горох", "135"));
        menuList.add(new Menu("ТЕПЛИЙ САЛАТ З ПЕЧІНКОЮ ТА ПЕРЕПЕЛИНИМИ ЯЙЦЯМИ", "мікс капусти, помідори чері, печінка куряча, перепелині яйця, цибуля, мед, коньяк, олія, сир пармезан", "175"));
        menuList.add(new Menu("САЛАТ З ПРОШУТТО ТА ГРУШЕЮ", "мікс капусти, прошутто (шинка), груша, соус італійський, сир пармезан", "175"));
        menuList.add(new Menu("ГРЕЦЬКИЙ", "мікс капусти, маслини, сир бринза, цибуля червона, огірок, перець, італійський соус, помідори чері", "155"));

        menuList.add(new Menu("Салати з цибулею", "Олів’є з індичкою, Теплий салат з печінкою та перепелиними яйцями, Салат грецький", "0"));
        menuList.add(new Menu("Салати без цибулі", "Салат з прошутто та грушею, Теплий салат з телятиною та журавлинним соусом, Цезар з курячим філе", "0"));

        menuList.add(new Menu("КРЕМ-СУП З ПЕЧЕРИЦЬ", "СУП", "135"));
        menuList.add(new Menu("БОРЩ ЗІ СВИНИНОЮ", "СУП", "115"));
        menuList.add(new Menu("БУЛЬЙОН З КУРКОЮ ТА ЛОКШИНОЮ", "СУП", "115"));
        menuList.add(new Menu("ГАРБУЗОВИЙ КРЕМ-СУП", "СУП", "135"));


        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


    }

    @Override
    protected void onResume() {
        super.onResume();

        name = findViewById(R.id.name);
        composition = findViewById(R.id.composition);
        price = findViewById(R.id.price);
        button = findViewById(R.id.button);


        Random random = new Random();
        List<Integer> usedNumbers = new ArrayList<Integer>();

        int min = 0;
        int max = 22;
        for (int i = 0; i < menuList.size(); i++) {
            randomNumber = random.nextInt(max - min + 1) + min;
            if (usedNumbers.contains(randomNumber)) {
                i--;
            } else {
                usedNumbers.add(randomNumber);

                name.setText("Назва: " + menuList.get(randomNumber).getName());
                composition.setText("Склад: ");
                price.setText("Ціна: ");
                button.setOnClickListener(this);
            }
        }
    }
    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.button) {
            composition.setText("Склад: " + menuList.get(randomNumber).getComposition());
            price.setText("Ціна: " + menuList.get(randomNumber).getPrice());
            view.setOnClickListener(clickListener(view));
        }
    }

    private View.OnClickListener clickListener(View view){
            View.OnClickListener click = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (view.getId()==R.id.button) {
                        onResume();
                    }
            }};
                return click;
    }

}