package au.com.unsw.www.infs3634assignment;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import au.com.unsw.www.infs3634assignment.Quiz_Container.*;

public class DatabaseClass extends SQLiteOpenHelper {

    private static final String DB_NAME = "Learning_App";
    private static final int DB_VERSION = 1;

    SQLiteDatabase myDb;

    public DatabaseClass(Context context) {
        super(context, DB_NAME,null,DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase myDb) {
        this.myDb = myDb;

        final String Create_Questions_Table = "CREATE TABLE " +
                QuestionsTable.Table_Name + "(" +
                QuestionsTable._ID + "INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionsTable.Option_One + "TEXT," +
                QuestionsTable.Option_Two + "TEXT," +
                QuestionsTable.Option_Three + "TEXT," +
                QuestionsTable.Right_Answer + "INTEGER" +
                ")";

        myDb.execSQL(Create_Questions_Table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        myDb.execSQL("DROP TABLE IF EXISTS " + QuestionsTable.Table_Name);
        onCreate(myDb);
    }

    private void fillQuestionsTable(){
        Questions q1 = new Questions("A is correct", "A", "B", "C", 1);
        addQuestion(q1);
        Questions q2 = new Questions("B is correct", "A", "B", "C", 2);
        addQuestion(q2);
        Questions q3 = new Questions("A is correct", "A", "B", "C", 1);
        addQuestion(q3);
        Questions q4 = new Questions("C is correct", "A", "B", "C", 3);
        addQuestion(q4);

    }

    private void addQuestion(Questions questions){
        ContentValues cv = new ContentValues();
        cv.put(QuestionsTable.Question_Content, questions.getqContent());
        cv.put(QuestionsTable.Option_One, questions.getOption1());
        cv.put(QuestionsTable.Option_Two, questions.getOption2());
        cv.put(QuestionsTable.Option_Three, questions.getOption3());
        cv.put(QuestionsTable.Right_Answer, questions.getRightAnswer());
        myDb.insert(QuestionsTable.Table_Name, null, cv);


    }
}
