package at.sw2017.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import java.util.ArrayList;

public class Calculator extends Activity implements View.OnClickListener {
ArrayList<Button>numberButtons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*
        Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(this);

        Button buttonPlus = (Button) findViewById(R.id.button_plus);
        buttonPlus.setOnClickListener(this);


        Button buttonDiv = (Button) findViewById(R.id.button_div);
        buttonDiv.setOnClickListener(this);

        Button buttonEqual = (Button) findViewById(R.id.button_equal);
        buttonEqual.setOnClickListener(this);

        Button button0 = (Button) findViewById(R.id.button_0);
        button0.setOnClickListener(this);

        Button buttonC = (Button) findViewById(R.id.button_C);
        buttonC.setOnClickListener(this);

        Button buttonMulti = (Button) findViewById(R.id.button_multi);
        buttonMulti.setOnClickListener(this);

        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button_2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button_3);
        button3.setOnClickListener(this);

        Button buttonMinus = (Button) findViewById(R.id.button_minus);
        buttonMinus.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button_4);
        button4.setOnClickListener(this);

        Button button5 = (Button) findViewById(R.id.button_5);
        button5.setOnClickListener(this);

        Button button6 = (Button) findViewById(R.id.button_6);
        button6.setOnClickListener(this);


        Button button7 = (Button) findViewById(R.id.button_7);
        button7.setOnClickListener(this);

        Button button8 = (Button) findViewById(R.id.button_acht);
        button8.setOnClickListener(this);


*/




        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }

    public void setUpNumberButtonListener(){
        for(int i = 0; i<=9; i++)
        {
            String buttonName = "button"+ i;
            int id = getResources().getIdentifier(buttonName, "id", R.class.getPackage().getName());
            Button button = (Button) findViewById(id);
            button.setOnClickListener(this);
            numberButtons.add(button);
        }
    }


    @Override
    public void onClick(View v) {




    }
}
