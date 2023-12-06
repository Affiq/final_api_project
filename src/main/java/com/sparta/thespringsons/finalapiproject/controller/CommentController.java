package com.sparta.thespringsons.finalapiproject.controller;

import com.sparta.thespringsons.finalapiproject.model.entities.Comment;
import com.sparta.thespringsons.finalapiproject.model.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentController {

    private final CommentService commentService;
    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/comment")
    public List<Comment> getAllComments(){
        return commentService.getAllComments();
    }

    @GetMapping("/commentsbyname/{name}")
    public List<Comment> getAllCommentsByName(@PathVariable String name){
        return commentService.getAllByName(name);
    }

    @GetMapping("/commentsbymovietitle/{movieTitle}")
    public List<Comment> getAllCommentsByMovieTitle(@PathVariable String movieTitle){
        return commentService.getAllCommentsByMovieTitle(movieTitle);
    }
}
    //
//
//        // Assuming we'll have a service for handling comments
//        private final CommentService commentService;
//
//        @Autowired
//        public CommentsController(CommentService commentService) {
//            this.commentService = commentService;
//        }
//
//        @Tag(name = "Comments API")
//        @Operation(summary = "Get all comments")
//        @GetMapping
//        public List<Comment> getAllComments() {
//            return commentService.getAllComments();
//        }

    // @PostMapping
    // public Comment createComment(@RequestBody CommentRequest commentRequest) {
    //    return commentService.createComment(commentRequest);
    // }

    // @PutMapping("/{commentId}")
    // public Comment updateComment(@PathVariable String commentId, @RequestBody CommentRequest commentRequest) {
    //    return commentService.updateComment(commentId, commentRequest);
    // }

    // @DeleteMapping("/{commentId}")
    // public void deleteComment(@PathVariable String commentId) {
    //    commentService.deleteComment(commentId);
    // }
