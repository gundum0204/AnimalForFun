package com.example.animalforfun;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class Game extends AppCompatActivity {


    //ประกาศตัวแปร
    ImageView questiImageView;
    ImageButton volumeImageButton;
    Button btn1,btn2,btn3,btn4;
    int questionCount = 10;
    //สุ่มข้อ
    ArrayList<Integer> qID = new ArrayList<Integer>();
    String answer;
    MediaPlayer mediaPlayer;
    int score = 0;
    String getNameString;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //ผูกตัวแปร Java กับ XML
        questiImageView = findViewById(R.id.imvQ);
        volumeImageButton = findViewById(R.id.imbVolume);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        for (int i = 1; i <= questionCount; i++) {
            qID.add(i);
        }
        Collections.shuffle(qID);
        setQuestion(qID.remove(0));




    }//end onCreate
    //หน้าที่สร้างคำถาม
    private void setQuestion(Integer qID) {
        if (qID == 1) {
            answer = "นก";
            questiImageView.setImageResource(R.drawable.bird);
            mediaPlayer = MediaPlayer.create(this,R.raw.bird);
            //สุ่มคำตอบ
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("นก");
            choice.add("แมว");
            choice.add("วัว");
            choice.add("แกะ");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 2) {
            answer = "แมว";
            questiImageView.setImageResource(R.drawable.cat);
            mediaPlayer = MediaPlayer.create(this,R.raw.cat);
            //สุ่มคำตอบ
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("แมว");
            choice.add("หมา");
            choice.add("วัว");
            choice.add("แกะ");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 3) {
            answer = "วัว";
            questiImageView.setImageResource(R.drawable.cow);
            mediaPlayer = MediaPlayer.create(this,R.raw.cow);
            //สุ่มคำตอบ
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("วัว");
            choice.add("แมว");
            choice.add("หมา");
            choice.add("แกะ");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 4) {
            answer = "หมา";
            questiImageView.setImageResource(R.drawable.dog);
            mediaPlayer = MediaPlayer.create(this,R.raw.dog);
            //สุ่มคำตอบ
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("หมา");
            choice.add("แมว");
            choice.add("วัว");
            choice.add("แกะ");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 5) {
            answer = "ช้าง";
            questiImageView.setImageResource(R.drawable.elephant);
            mediaPlayer = MediaPlayer.create(this,R.raw.elephant);
            //สุ่มคำตอบ
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ช้าง");
            choice.add("แมว");
            choice.add("วัว");
            choice.add("แกะ");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 6) {
            answer = "ม้า";
            questiImageView.setImageResource(R.drawable.horse);
            mediaPlayer = MediaPlayer.create(this,R.raw.horse);
            //สุ่มคำตอบ
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ม้า");
            choice.add("แมว");
            choice.add("วัว");
            choice.add("แกะ");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 7) {
            answer = "สิงโต";
            questiImageView.setImageResource(R.drawable.lion);
            mediaPlayer = MediaPlayer.create(this,R.raw.lion);
            //สุ่มคำตอบ
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("สิงโต");
            choice.add("แมว");
            choice.add("วัว");
            choice.add("แกะ");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 8) {
            answer = "ยุง";
            questiImageView.setImageResource(R.drawable.mosquito);
            mediaPlayer = MediaPlayer.create(this,R.raw.mosquito);
            //สุ่มคำตอบ
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ยุง");
            choice.add("แมว");
            choice.add("วัว");
            choice.add("แกะ");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 9) {
            answer = "หมู";
            questiImageView.setImageResource(R.drawable.pig);
            mediaPlayer = MediaPlayer.create(this,R.raw.pig);
            //สุ่มคำตอบ
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("หมู");
            choice.add("แมว");
            choice.add("วัว");
            choice.add("แกะ");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 10) {
            answer = "แกะ";
            questiImageView.setImageResource(R.drawable.sheep);
            mediaPlayer = MediaPlayer.create(this,R.raw.sheep);
            //สุ่มคำตอบ
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("แกะ");
            choice.add("แมว");
            choice.add("วัว");
            choice.add("ยุง");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }



    }//end setQuestion

    public void playSound(View view) {
        mediaPlayer.start();
    }//end playSound

    public void choiceAns(View view) {
        Button button = (Button) view;
        String buttonString = button.getText().toString();
        if (buttonString.equals(answer)) {
            score++;
        }
        if (qID.isEmpty()) {
            //Toast.makeText(getApplicationContext(), "คุณได้" + score + " คะแนน", Toast.LENGTH_SHORT).show();
            dialogboxScore();
        } else {
            setQuestion(qID.remove(0));
        }
    }//end choiceAns() method

    private void dialogboxScore() {
        //รับค่า Intent เพื่อมาแสดงผล
        getNameString = getIntent().getStringExtra("Name");

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Summary Score!");
        builder.setMessage(getNameString + " ได้ " + score + " คะแนน")
                .setCancelable(false)
                .setPositiveButton("Play Again", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);
                    }
                })
                .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }//end  dialogboxScore() method
}//end class
