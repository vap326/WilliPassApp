package com.example.willipass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button generator;
    EditText type1;
    EditText type2;
    EditText type3;
    EditText type4;
    EditText per1;
    EditText per2;
    EditText per3;
    EditText per4;
    EditText grade1;
    EditText grade2;
    EditText grade3;
    EditText grade4;
    EditText finalGrade;

    double p1;
    double p2;
    double p3;
    double p4;

    double g1;
    double g2;
    double g3;
    double g4;

    double fg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generator = (Button) findViewById(R.id.id_button);
        type1 = (EditText) findViewById(R.id.id_editText1);
        type2 = (EditText) findViewById(R.id.id_editText2);
        type3 = (EditText) findViewById(R.id.id_editText3);
        type4 = (EditText) findViewById(R.id.id_editText12);
        per1 = (EditText) findViewById(R.id.id_editText4);
        per2 = (EditText) findViewById(R.id.id_editText5);
        per3 = (EditText) findViewById(R.id.id_editText6);
        per4 = (EditText) findViewById(R.id.id_editText13);
        grade1 = (EditText) findViewById(R.id.id_editText7);
        grade2 = (EditText) findViewById(R.id.id_editText8);
        grade3 = (EditText) findViewById(R.id.id_editText9);
        grade4 = (EditText) findViewById(R.id.id_editText14);
        finalGrade = (EditText) findViewById(R.id.id_editTextFinal);

        generator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p1 = Double.valueOf(per1.getText().toString());
                p2 = Double.valueOf(per2.getText().toString());
                p3 = Double.valueOf(per3.getText().toString());
                p4 = Double.valueOf(per4.getText().toString());

                fg = Double.valueOf(finalGrade.getText().toString());

                if(grade1.getText().toString().equals("-1")){
                    if(grade2.getText().toString().equals("-1")){
                        if(grade3.getText().toString().equals("-1")){
                            if(grade4.getText().toString().equals("-1")){
                                grade1.setText(String.valueOf(fg));
                                grade2.setText(String.valueOf(fg));
                                grade3.setText(String.valueOf(fg));
                                grade4.setText(String.valueOf(fg));
                            }
                            else{
                                g4 = Double.valueOf(grade4.getText().toString());
                                g3 = (fg - (p4/100.00)*g4)/((p1/100.00) + (p2/100.00) + (p3/100.00) );
                                g2 = (fg - (p4/100.00)*g4)/((p1/100.00) + (p2/100.00) + (p3/100.00) );
                                g1 = (fg - (p4/100.00)*g4)/((p1/100.00) + (p2/100.00) + (p3/100.00) );

                                grade1.setText(String.valueOf(g1));
                                grade2.setText(String.valueOf(g2));
                                grade3.setText(String.valueOf(g3));
                            }
                        }
                        else{
                            g3 = Double.valueOf(grade3.getText().toString());
                            if(grade4.getText().toString().equals("-1")){
                                g4 = (fg - (p3/100.00)*g3)/((p1/100.00) + (p2/100.00) + (p4/100.00) );
                                g2 = (fg - (p3/100.00)*g3)/((p1/100.00) + (p2/100.00) + (p4/100.00) );
                                g1 = (fg - (p3/100.00)*g3)/((p1/100.00) + (p2/100.00) + (p4/100.00) );

                                grade1.setText(String.valueOf(g1));
                                grade2.setText(String.valueOf(g2));
                                grade4.setText(String.valueOf(g4));
                            }
                            else{
                                g4 = Double.valueOf(grade4.getText().toString());
                                g2 = (fg - (p4/100.00)*g4 - (p3/100.00)*g3)/((p1/100.00) + (p2/100.00) );
                                g1 = (fg - (p4/100.00)*g4 - (p3/100.00)*g3)/((p1/100.00) + (p2/100.00) );

                                grade1.setText(String.valueOf(g1));
                                grade2.setText(String.valueOf(g2));
                            }
                        }
                    }
                    else{
                        g2 = Double.valueOf(grade2.getText().toString());
                        if(grade3.getText().toString().equals("-1")){
                            if(grade4.getText().toString().equals("-1")){
                                g4 = (fg - (p2/100.00)*g2)/((p1/100.00) + (p3/100.00) + (p4/100.00) );
                                g3 = (fg - (p2/100.00)*g2)/((p1/100.00) + (p3/100.00) + (p4/100.00) );
                                g1 = (fg - (p2/100.00)*g2)/((p1/100.00) + (p3/100.00) + (p4/100.00) );

                                grade1.setText(String.valueOf(g1));
                                grade3.setText(String.valueOf(g3));
                                grade4.setText(String.valueOf(g4));
                            }
                            else{
                                g4 = Double.valueOf(grade4.getText().toString());
                                g3 = (fg - (p4/100.00)*g4 - (p2/100.00)*g2)/((p1/100.00) + (p3/100.00) );
                                g1 = (fg - (p4/100.00)*g4 - (p2/100.00)*g2)/((p1/100.00) + (p3/100.00) );

                                grade1.setText(String.valueOf(g1));
                                grade3.setText(String.valueOf(g3));
                            }
                        }
                        else{
                            g3 = Double.valueOf(grade3.getText().toString());
                            if(grade4.getText().toString().equals("-1")){
                                g4 = (fg - (p3/100.00)*g3 - (p2/100.00)*g2)/((p1/100.00) + (p4/100.00) );
                                g1 = (fg - (p3/100.00)*g3 - (p2/100.00)*g2)/((p1/100.00) + (p4/100.00) );

                                grade1.setText(String.valueOf(g1));
                                grade4.setText(String.valueOf(g4));
                            }
                            else{
                                g4 = Double.valueOf(grade4.getText().toString());
                                g1 = (fg - (p4/100.00)*g4 - (p3/100.00)*g3 - (p2/100.00)*g2)/((p1/100.00) );

                                grade1.setText(String.valueOf(g1));
                            }
                        }
                    }
                }
                else{
                    g1 = Double.valueOf(grade1.getText().toString());
                    if(grade2.getText().toString().equals("-1")){
                        if(grade3.getText().toString().equals("-1")){
                            if(grade4.getText().toString().equals("-1")){
                                g4 = (fg - (p1/100.00)*g1)/((p4/100.00) + (p2/100.00) + (p3/100.00) );
                                g3 = (fg - (p1/100.00)*g1)/((p4/100.00) + (p2/100.00) + (p3/100.00) );
                                g2 = (fg - (p1/100.00)*g1)/((p4/100.00) + (p2/100.00) + (p3/100.00) );

                                grade4.setText(String.valueOf(g4));
                                grade2.setText(String.valueOf(g2));
                                grade3.setText(String.valueOf(g3));
                            }
                            else{
                                g4 = Double.valueOf(grade4.getText().toString());
                                g3 = (fg - (p4/100.00)*g4 - (p1/100.00)*g1)/( (p2/100.00) + (p3/100.00) );
                                g2 = (fg - (p4/100.00)*g4 - (p1/100.00)*g1)/((p1/100.00) + (p2/100.00) + (p3/100.00) );

                                grade2.setText(String.valueOf(g2));
                                grade3.setText(String.valueOf(g3));
                            }
                        }
                        else{
                            g3 = Double.valueOf(grade3.getText().toString());
                            if(grade4.getText().toString().equals("-1")){
                                g4 = (fg - (p3/100.00)*g3 - (p1/100.00)*g1)/((p2/100.00) + (p4/100.00) );
                                g2 = (fg - (p3/100.00)*g3 - (p1/100.00)*g1)/((p2/100.00) + (p4/100.00) );

                                grade2.setText(String.valueOf(g2));
                                grade4.setText(String.valueOf(g4));
                            }
                            else{
                                g4 = Double.valueOf(grade4.getText().toString());
                                g2 = (fg - (p4/100.00)*g4 - (p3/100.00)*g3 - (p1/100.00)*g1)/((p2/100.00) );

                                grade2.setText(String.valueOf(g2));
                            }
                        }
                    }
                    else{
                        g2 = Double.valueOf(grade2.getText().toString());
                        if(grade3.getText().toString().equals("-1")){
                            if(grade4.getText().toString().equals("-1")){
                                g4 = (fg - (p2/100.00)*g2 - (p1/100.00)*g1)/( (p3/100.00) + (p4/100.00) );
                                g3 = (fg - (p2/100.00)*g2  - (p1/100.00)*g1)/( (p3/100.00) + (p4/100.00) );

                                grade3.setText(String.valueOf(g3));
                                grade4.setText(String.valueOf(g4));
                            }
                            else{
                                g4 = Double.valueOf(grade4.getText().toString());
                                g3 = (fg - (p4/100.00)*g4 - (p2/100.00)*g2 - (p1/100.00)*g1)/((p3/100.00) );

                                grade3.setText(String.valueOf(g3));
                            }
                        }
                        else{
                            g3 = Double.valueOf(grade3.getText().toString());
                            if(grade4.getText().toString().equals("-1")){
                                g4 = (fg - (p3/100)*g3 - (p2/100)*g2 - (p1/100.00)*g1)/((p4/100.00) );

                                grade4.setText(String.valueOf(g4));
                            }
                            else{
                                g4 = Double.valueOf(grade4.getText().toString());
                            }

                        }
                    }
                }
            }
        });
    }
}