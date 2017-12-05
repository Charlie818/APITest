package com.example.qiujiarong.apitest2;

/**
 * Created by qiujiarong on 05/12/2017.
 */

public class Relation {
    String subject;
    String relation;
    String object;
    public Relation(String subject,String relation,String object){
        this.subject=subject;
        this.relation=relation;
        this.object=object;

    }

    public String getSubject() {
        return subject;
    }

    public String getRelation() {
        return relation;
    }

    public String getObject() {
        return object;
    }
}
