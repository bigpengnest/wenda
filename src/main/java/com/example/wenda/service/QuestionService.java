package com.example.wenda.service;

import com.example.wenda.dao.QuestionDAO;
import com.example.wenda.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDAO questionDAO;

    public int addQuestion(Question question){
        questionDAO.addQuestion(question);
        return questionDAO.addQuestion(question) >0 ? question.getId() :0;
    }


    public List<Question> getLatestQuestion(int userId,int offset,int limit){
        return questionDAO.selectLatestQuestions(userId,offset,limit);
    }
}
