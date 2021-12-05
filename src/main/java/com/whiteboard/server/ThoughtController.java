package com.whiteboard.server;

import com.whiteboard.server.db.Thought;
import com.whiteboard.server.db.ThoughtRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/")
public class ThoughtController {
    @Autowired
    private ThoughtRepository thoughtRepository;

    @GetMapping(path="/all")
    @ResponseBody 
    public Iterable<Thought> getAllUsers() {
      // This returns a JSON or XML with the users
      return thoughtRepository.findAll();
    }

}
