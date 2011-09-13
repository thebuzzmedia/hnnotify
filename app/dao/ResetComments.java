package dao;

import java.util.List;

import models.Comment;
import models.Comment.State;

public class ResetComments {
	public static void main(String[] args) {
		List<Comment> list = DAO.findAllComments();
		
		System.out.printf("Found %d comments...\n", list.size());
		
		for(Comment c : list) {
			c.state = State.NEW;
			c.parentUsername = null;
			DAO.updateComment(c);
		}
	}
}