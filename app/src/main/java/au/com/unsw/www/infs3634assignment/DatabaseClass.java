package au.com.unsw.www.infs3634assignment;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;

public class DatabaseClass {

    SQLiteDatabase qBank = null;

    public void createDatabase(View view){
        try{
            qBank = qBank.openOrCreateDatabase("myQuestions", MODE_PRIVATE, null);

            qBank.execSQL("CREATE TABLE IF NOT EXISTS questions" + "(id integer primary key, module VARCHAR, questionText text)");
        }
    }
}
