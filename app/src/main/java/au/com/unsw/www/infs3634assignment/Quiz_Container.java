package au.com.unsw.www.infs3634assignment;

import android.provider.BaseColumns;

public final class Quiz_Container {

    private Quiz_Container(){}

    public static class QuestionsTable implements BaseColumns{
        public static final String Table_Name = "quiz_questions";
        public static final String Question_Content = "question";
        public static final String Option_One = "option one";
        public static final String Option_Two = "option two";
        public static final String Option_Three = "option three";
        public static final String Right_Answer = "right answer";





    }
}
