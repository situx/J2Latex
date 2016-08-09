package com.github.situx.compiler.treej;

import com.github.situx.compiler.visitorj.Visitor;

public class Greater implements Node{
	public Node op1;
	public Node op2;
	public boolean eq,leftright;
	public Greater(Node op1, Node op2, boolean leftright,boolean eq){
		super();
		this.op1 = op1;
		this.op2 = op2;
		this.eq=eq;
		this.leftright=leftright;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
	
	public void welcome(Visitor v) {
		v.visit(this);
	}
}
