/* This file was generated by SableCC (http://www.sablecc.org/). */

package lexAndParse.analysis;

import java.util.*;
import lexAndParse.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
	
	private int indent = 0;
	
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPProgram().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAProgram(AProgram node)
    {
        defaultIn(node);
    }

    public void outAProgram(AProgram node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProgram(AProgram node)
    {
    	for(int i=0;i<indent;i++) System.out.print(" ");
    	indent++;
    	System.out.println("(Program ");
        inAProgram(node);
        if(node.getMainclass() != null)
        {
            node.getMainclass().apply(this);
        }
        {
            List<PClassdecl> copy = new ArrayList<PClassdecl>(node.getClassdecl());
            for(PClassdecl e : copy)
            {
                e.apply(this);
            }
        }
        outAProgram(node);
        indent--;
        for(int i=0;i<indent;i++) System.out.print(" ");
        System.out.println(")");
        
    }

    public void inAMainclass(AMainclass node)
    {
        defaultIn(node);
    }

    public void outAMainclass(AMainclass node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMainclass(AMainclass node)
    {
    	for(int i=0;i<indent;i++) System.out.print(" ");
    	indent++;
    	System.out.println("(MainClass");
        inAMainclass(node);
        if(node.getClasstag() != null)
        {
            node.getClasstag().apply(this);
        }
        if(node.getClassname() != null)
        {
            node.getClassname().apply(this);
        }
        if(node.getOuterL() != null)
        {
            node.getOuterL().apply(this);
        }
        if(node.getPublic() != null)
        {
            node.getPublic().apply(this);
        }
        if(node.getStatic() != null)
        {
            node.getStatic().apply(this);
        }
        if(node.getVoid() != null)
        {
            node.getVoid().apply(this);
        }
        if(node.getMain() != null)
        {
            node.getMain().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        if(node.getArrL() != null)
        {
            node.getArrL().apply(this);
        }
        if(node.getArrR() != null)
        {
            node.getArrR().apply(this);
        }
        if(node.getMainargname() != null)
        {
            node.getMainargname().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getInnerL() != null)
        {
            node.getInnerL().apply(this);
        }
        {
            List<PVardecl> copy = new ArrayList<PVardecl>(node.getVardecl());
            for(PVardecl e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PStmt> copy = new ArrayList<PStmt>(node.getStmt());
            for(PStmt e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getInnerR() != null)
        {
            node.getInnerR().apply(this);
        }
        if(node.getOuterR() != null)
        {
            node.getOuterR().apply(this);
        }
        outAMainclass(node);
        indent--;
        for(int i=0;i<indent;i++) System.out.print(" ");
        System.out.println(")");
        
    }

    public void inAClassdecl(AClassdecl node)
    {
        defaultIn(node);
    }

    public void outAClassdecl(AClassdecl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAClassdecl(AClassdecl node)
    {
    	for(int i=0;i<indent;i++) System.out.print(" ");
    	indent++;
    	System.out.println("(ClassDeclSimpe");
        inAClassdecl(node);
        if(node.getClasstag() != null)
        {
            node.getClasstag().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getLM() != null)
        {
            node.getLM().apply(this);
        }
        {
            List<PVardecl> copy = new ArrayList<PVardecl>(node.getVardecl());
            for(PVardecl e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PMethoddecl> copy = new ArrayList<PMethoddecl>(node.getMethoddecl());
            for(PMethoddecl e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getRM() != null)
        {
            node.getRM().apply(this);
        }
        outAClassdecl(node);
        
        indent--;
        for(int i=0;i<indent;i++) System.out.print(" ");
        System.out.println(")");
    }

    public void inAVardecl(AVardecl node)
    {
        defaultIn(node);
    }

    public void outAVardecl(AVardecl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVardecl(AVardecl node)
    {
    	for(int i=0;i<indent;i++) System.out.print(" ");
    	indent++;
    	System.out.println("(VarDecl");
    	
        inAVardecl(node);
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getSmc() != null)
        {
            node.getSmc().apply(this);
        }
        
        indent--;
        for(int i=0;i<indent;i++) System.out.print(" ");
        System.out.println(")");
        
        outAVardecl(node);
    }

    public void inAMethoddecl(AMethoddecl node)
    {
        defaultIn(node);
    }

    public void outAMethoddecl(AMethoddecl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMethoddecl(AMethoddecl node)
    {
    	for(int i=0;i<indent;i++) System.out.print(" ");
    	indent++;
    	System.out.println("(MethodDecl");
    	
    	
        inAMethoddecl(node);
        if(node.getPublic() != null)
        {
            node.getPublic().apply(this);
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getFormallist() != null)
        {
            node.getFormallist().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getLM() != null)
        {
            node.getLM().apply(this);
        }
        {
            List<PVardecl> copy = new ArrayList<PVardecl>(node.getVardecl());
            for(PVardecl e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PStmt> copy = new ArrayList<PStmt>(node.getStmt());
            for(PStmt e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getReturn() != null)
        {
            node.getReturn().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getSmc() != null)
        {
            node.getSmc().apply(this);
        }
        if(node.getRM() != null)
        {
            node.getRM().apply(this);
        }
        outAMethoddecl(node);
        
        indent--;
        for(int i=0;i<indent;i++) System.out.print(" ");
        System.out.println(")");
        
    }

    public void inAFormallist(AFormallist node)
    {
        defaultIn(node);
    }

    public void outAFormallist(AFormallist node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFormallist(AFormallist node)
    {
    	for(int i=0;i<indent;i++) System.out.print(" ");
    	indent++;
    	System.out.println("(Formal");
    	
        inAFormallist(node);
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        {
            List<PFormalrest> copy = new ArrayList<PFormalrest>(node.getFormalrest());
            for(PFormalrest e : copy)
            {
                e.apply(this);
            }
        }
        outAFormallist(node);
        
        indent--;
        for(int i=0;i<indent;i++) System.out.print(" ");
        System.out.println(")");
    }

    public void inAFormalrest(AFormalrest node)
    {
        defaultIn(node);
    }

    public void outAFormalrest(AFormalrest node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFormalrest(AFormalrest node)
    {
    	for(int i=0;i<indent;i++) System.out.print(" ");
    	indent++;
    	System.out.println("(FormalRest");
    	
        inAFormalrest(node);
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAFormalrest(node);
        
        indent--;
        for(int i=0;i<indent;i++) System.out.print(" ");
        System.out.println(")");
    }

    public void inAIntArrType(AIntArrType node)
    {
        defaultIn(node);
    }

    public void outAIntArrType(AIntArrType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntArrType(AIntArrType node)
    {
    	for(int i=0;i<indent;i++) System.out.print(" ");
    	indent++;
    	
    	System.out.println("(IntegerArrayType");
    	
        inAIntArrType(node);
        if(node.getIntArr() != null)
        {
            node.getIntArr().apply(this);
        }
        
        indent--;
        for(int i=0;i<indent;i++) System.out.print(" ");
        System.out.println(")");
        
        outAIntArrType(node);
    }

    public void inABooleanType(ABooleanType node)
    {
        defaultIn(node);
    }

    public void outABooleanType(ABooleanType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABooleanType(ABooleanType node)
    {
    	for(int i=0;i<indent;i++) System.out.print(" ");
    	indent++;
    	
    	System.out.println("(BooleanType");
    	
        inABooleanType(node);
        if(node.getBoolean() != null)
        {
            node.getBoolean().apply(this);
        }
        outABooleanType(node);
        
        indent--;
        for(int i=0;i<indent;i++) System.out.print(" ");
        System.out.println(")");
    }

    public void inAIntType(AIntType node)
    {
        defaultIn(node);
    }

    public void outAIntType(AIntType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntType(AIntType node)
    {
    	for(int i=0;i<indent;i++) System.out.print(" ");
    	indent++;
    	
    	System.out.println("(IntegerType");
    	
        inAIntType(node);
        if(node.getInt() != null)
        {
            node.getInt().apply(this);
        }
        outAIntType(node);
        
        indent--;
        for(int i=0;i<indent;i++) System.out.print(" ");
        System.out.println(")");
    }

    public void inAIdType(AIdType node)
    {
        defaultIn(node);
    }

    public void outAIdType(AIdType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdType(AIdType node)
    {
        inAIdType(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAIdType(node);
    }

    public void inAStmtsStmt(AStmtsStmt node)
    {
        defaultIn(node);
    }

    public void outAStmtsStmt(AStmtsStmt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStmtsStmt(AStmtsStmt node)
    {	
        inAStmtsStmt(node);
        if(node.getLM() != null)
        {
            node.getLM().apply(this);
        }
        if(node.getStmt() != null)
        {
            node.getStmt().apply(this);
        }
        if(node.getRM() != null)
        {
            node.getRM().apply(this);
        }
        outAStmtsStmt(node);

    }

    public void inAIfStmt(AIfStmt node)
    {
        defaultIn(node);
    }

    public void outAIfStmt(AIfStmt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIfStmt(AIfStmt node)
    {
    	for(int i=0;i<indent;i++) System.out.print(" ");
    	indent++;
    	
    	System.out.println("(If");
    	
        inAIfStmt(node);
        if(node.getIf() != null)
        {
            node.getIf().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getIftrue() != null)
        {
            node.getIftrue().apply(this);
        }
        if(node.getElse() != null)
        {
            node.getElse().apply(this);
        }
        if(node.getIffalse() != null)
        {
            node.getIffalse().apply(this);
        }
        
        indent--;
        for(int i=0;i<indent;i++) System.out.print(" ");
        System.out.println(")");
        
        outAIfStmt(node);
    }

    public void inAWhileStmt(AWhileStmt node)
    {
        defaultIn(node);
    }

    public void outAWhileStmt(AWhileStmt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAWhileStmt(AWhileStmt node)
    {
    	for(int i=0;i<indent;i++) System.out.print(" ");
    	indent++;
    	
    	System.out.println("(While");
    	
        inAWhileStmt(node);
        if(node.getWhile() != null)
        {
            node.getWhile().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getStmt() != null)
        {
            node.getStmt().apply(this);
        }
        outAWhileStmt(node);
        
        indent--;
        for(int i=0;i<indent;i++) System.out.print(" ");
        System.out.println(")");
    }

    public void inASysoutStmt(ASysoutStmt node)
    {
        defaultIn(node);
    }

    public void outASysoutStmt(ASysoutStmt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASysoutStmt(ASysoutStmt node)
    {
    	for(int i=0;i<indent;i++) System.out.print(" ");
    	indent++;
    	
    	System.out.println("(Print");
    	
        inASysoutStmt(node);
        if(node.getSysout() != null)
        {
            node.getSysout().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getSmc() != null)
        {
            node.getSmc().apply(this);
        }
        outASysoutStmt(node);
        
        indent--;
        for(int i=0;i<indent;i++) System.out.print(" ");
        System.out.println(")");
    }

    public void inAAssignStmt(AAssignStmt node)
    {
        defaultIn(node);
    }

    public void outAAssignStmt(AAssignStmt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAssignStmt(AAssignStmt node)
    {
    	for(int i=0;i<indent;i++) System.out.print(" ");
    	indent++;
    	
    	System.out.println("(Assign");
    	
        inAAssignStmt(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getEq() != null)
        {
            node.getEq().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getSmc() != null)
        {
            node.getSmc().apply(this);
        }
        outAAssignStmt(node);
        
        indent--;
        for(int i=0;i<indent;i++) System.out.print(" ");
        System.out.println(")");
    }

    public void inAIdxAcsStmt(AIdxAcsStmt node)
    {
        defaultIn(node);
    }

    public void outAIdxAcsStmt(AIdxAcsStmt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdxAcsStmt(AIdxAcsStmt node)
    {
    	for(int i=0;i<indent;i++) System.out.print(" ");
    	indent++;
    	
    	System.out.println("(AssignArray");
    	
        inAIdxAcsStmt(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getLSq() != null)
        {
            node.getLSq().apply(this);
        }
        if(node.getIdx() != null)
        {
            node.getIdx().apply(this);
        }
        if(node.getRSq() != null)
        {
            node.getRSq().apply(this);
        }
        if(node.getEq() != null)
        {
            node.getEq().apply(this);
        }
        if(node.getAssgn() != null)
        {
            node.getAssgn().apply(this);
        }
        if(node.getSmc() != null)
        {
            node.getSmc().apply(this);
        }
        outAIdxAcsStmt(node);
        
        indent--;
        for(int i=0;i<indent;i++) System.out.print(" ");
        System.out.println(")");
    }

    public void inADoopExp(ADoopExp node)
    {
        defaultIn(node);
    }

    public void outADoopExp(ADoopExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADoopExp(ADoopExp node)
    {
    	//for(int i=0;i<indent;i++) System.out.print(" ");
    	//indent++;
    	//System.out.println("(" + node.getOp());
    	
        inADoopExp(node);
        if(node.getOp() != null)
        {
            node.getOp().apply(this);
        }
        indent++;
        if(node.getAssgnto() != null)
        {
            node.getAssgnto().apply(this);
        }
        if(node.getAssgnfrom() != null)
        {
            node.getAssgnfrom().apply(this);
        }
        indent--;
        outADoopExp(node);
        
        indent--;
        for(int i=0;i<indent;i++) System.out.print(" ");
        System.out.println(")");
    }

    public void inAAccessIdxExp(AAccessIdxExp node)
    {
        defaultIn(node);
    }

    public void outAAccessIdxExp(AAccessIdxExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAccessIdxExp(AAccessIdxExp node)
    {
    	for(int i=0;i<indent;i++) System.out.print(" ");
    	indent++;
    	System.out.println("(AccessAtIndex");
    	
        inAAccessIdxExp(node);
        if(node.getObj() != null)
        {
            node.getObj().apply(this);
        }
        if(node.getLSq() != null)
        {
            node.getLSq().apply(this);
        }
        if(node.getIdx() != null)
        {
            node.getIdx().apply(this);
        }
        if(node.getRSq() != null)
        {
            node.getRSq().apply(this);
        }
        outAAccessIdxExp(node);
        
        indent--;
        for(int i=0;i<indent;i++) System.out.print(" ");
        System.out.println(")");
    }

    public void inAGetlengthExp(AGetlengthExp node)
    {
        defaultIn(node);
    }

    public void outAGetlengthExp(AGetlengthExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGetlengthExp(AGetlengthExp node)
    {
    	for(int i=0;i<indent;i++) System.out.print(" ");
    	indent++;
    	System.out.println("(ArrayLength");
    	
        inAGetlengthExp(node);
        if(node.getHexp() != null)
        {
            node.getHexp().apply(this);
        }
        if(node.getDot() != null)
        {
            node.getDot().apply(this);
        }
        if(node.getLength() != null)
        {
            node.getLength().apply(this);
        }
        outAGetlengthExp(node);
        
        indent--;
        for(int i=0;i<indent;i++) System.out.print(" ");
        System.out.println(")");
    }

    public void inAMethodCallExp(AMethodCallExp node)
    {
        defaultIn(node);
    }

    public void outAMethodCallExp(AMethodCallExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMethodCallExp(AMethodCallExp node)
    {
    	for(int i=0;i<indent;i++) System.out.print(" ");
    	indent++;
    	System.out.print("(Call [ ");
    	System.out.print(node.getIdentifier());
    	System.out.println(" ]");
    	
        inAMethodCallExp(node);
        if(node.getHexp() != null)
        {
            node.getHexp().apply(this);
        }
        
        if(node.getDot() != null)
        {
            node.getDot().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getExplist() != null)
        {
            node.getExplist().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        
        outAMethodCallExp(node);
        
        
        indent--;
        for(int i=0;i<indent;i++) System.out.print(" ");
        System.out.println(")");
    }

    public void inANegateExp(ANegateExp node)
    {
        defaultIn(node);
    }

    public void outANegateExp(ANegateExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANegateExp(ANegateExp node)
    {
    	for(int i=0;i<indent;i++) System.out.print(" ");
    	indent++;
    	System.out.println("(Negate");
    	
        inANegateExp(node);
        if(node.getExl() != null)
        {
            node.getExl().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outANegateExp(node);
        
        indent--;
        for(int i=0;i<indent;i++) System.out.print(" ");
        System.out.println(")");
    }

    public void inAExp(AExp node)
    {
        defaultIn(node);
    }

    public void outAExp(AExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExp(AExp node)
    {
        inAExp(node);
        if(node.getHexp() != null)
        {
            node.getHexp().apply(this);
        }
        outAExp(node);
    }

    public void inAIntLitHexp(AIntLitHexp node)
    {
        defaultIn(node);
    }

    public void outAIntLitHexp(AIntLitHexp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntLitHexp(AIntLitHexp node)
    {
    	for(int i=0;i<indent;i++) System.out.print(" ");
    	indent++;
    	System.out.println("(IntegerLiteral[ " + node.getIntLit() + " ]");
    	
        inAIntLitHexp(node);
        if(node.getIntLit() != null)
        {
            node.getIntLit().apply(this);
        }
        outAIntLitHexp(node);
        
        indent--;
        for(int i=0;i<indent;i++) System.out.print(" ");
        System.out.println(")");
    }

    public void inATrueHexp(ATrueHexp node)
    {
        defaultIn(node);
    }

    public void outATrueHexp(ATrueHexp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATrueHexp(ATrueHexp node)
    {
    	for(int i=0;i<indent;i++) System.out.print(" ");
    	indent++;
    	System.out.println("(TrueLiteral");
    	
        inATrueHexp(node);
        if(node.getTrue() != null)
        {
            node.getTrue().apply(this);
        }
        outATrueHexp(node);
        
        indent--;
        for(int i=0;i<indent;i++) System.out.print(" ");
        System.out.println(")");
    }

    public void inAFalseHexp(AFalseHexp node)
    {
        defaultIn(node);
    }

    public void outAFalseHexp(AFalseHexp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFalseHexp(AFalseHexp node)
    {
    	for(int i=0;i<indent;i++) System.out.print(" ");
    	indent++;
    	System.out.println("(FalseLiteral");
    	
        inAFalseHexp(node);
        if(node.getFalse() != null)
        {
            node.getFalse().apply(this);
        }
        outAFalseHexp(node);
        
        indent--;
        for(int i=0;i<indent;i++) System.out.print(" ");
        System.out.println(")");
    }

    public void inAIdHexp(AIdHexp node)
    {
        defaultIn(node);
    }

    public void outAIdHexp(AIdHexp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdHexp(AIdHexp node)
    {
        inAIdHexp(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAIdHexp(node);
        
    }

    public void inAThisHexp(AThisHexp node)
    {
        defaultIn(node);
    }

    public void outAThisHexp(AThisHexp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAThisHexp(AThisHexp node)
    {
    	for(int i=0;i<indent;i++) System.out.print(" ");
    	indent++;
    	System.out.println("(This");
    	
        inAThisHexp(node);
        if(node.getThis() != null)
        {
            node.getThis().apply(this);
        }
        outAThisHexp(node);
        
        indent--;
        for(int i=0;i<indent;i++) System.out.print(" ");
        System.out.println(")");
    }

    public void inAIntArrHexp(AIntArrHexp node)
    {
        defaultIn(node);
    }

    public void outAIntArrHexp(AIntArrHexp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntArrHexp(AIntArrHexp node)
    {
    	for(int i=0;i<indent;i++) System.out.print(" ");
    	indent++;
    	System.out.println("(NewInt[ " + node + "]");
    	
        inAIntArrHexp(node);
        if(node.getNew() != null)
        {
            node.getNew().apply(this);
        }
        if(node.getInt() != null)
        {
            node.getInt().apply(this);
        }
        if(node.getLSq() != null)
        {
            node.getLSq().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getRSq() != null)
        {
            node.getRSq().apply(this);
        }
        outAIntArrHexp(node);
        
        indent--;
        for(int i=0;i<indent;i++) System.out.print(" ");
        System.out.println(")");
    }

    public void inAConstructorHexp(AConstructorHexp node)
    {
        defaultIn(node);
    }

    public void outAConstructorHexp(AConstructorHexp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAConstructorHexp(AConstructorHexp node)
    {
    	for(int i=0;i<indent;i++) System.out.print(" ");
    	indent++;
    	
    	System.out.println("(NewObject");
    	
        inAConstructorHexp(node);
        if(node.getNew() != null)
        {
            node.getNew().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        outAConstructorHexp(node);
        
        indent--;
        for(int i=0;i<indent;i++) System.out.print(" ");
        System.out.println(")");
    }

    public void inAParanthesisHexp(AParanthesisHexp node)
    {
        defaultIn(node);
    }

    public void outAParanthesisHexp(AParanthesisHexp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParanthesisHexp(AParanthesisHexp node)
    {
    	//for(int i=0;i<indent;i++) System.out.print(" ");
    	//indent++;
    	//System.out.println("(");
    	
        inAParanthesisHexp(node);
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        outAParanthesisHexp(node);
    }

    public void inAExplist(AExplist node)
    {
        defaultIn(node);
    }

    public void outAExplist(AExplist node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExplist(AExplist node)
    {
        inAExplist(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        {
            List<PExprest> copy = new ArrayList<PExprest>(node.getExprest());
            for(PExprest e : copy)
            {
                e.apply(this);
            }
        }
        outAExplist(node);
    }

    public void inAExprest(AExprest node)
    {
        defaultIn(node);
    }

    public void outAExprest(AExprest node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExprest(AExprest node)
    {
        inAExprest(node);
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAExprest(node);
    }

    public void inAIdentifier(AIdentifier node)
    {
        defaultIn(node);
    }

    public void outAIdentifier(AIdentifier node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdentifier(AIdentifier node)
    {
    	for(int i=0;i<indent;i++) System.out.print(" ");
    	indent++;
    	System.out.println("(Identifier[ " + node + "]");
        
    	inAIdentifier(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdentifier(node);
        indent--;
        for(int i=0;i<indent;i++) System.out.print(" ");
        System.out.println(")");
    }
    

    public void inAAndOp(AAndOp node)
    {
        defaultIn(node);
    }

    public void outAAndOp(AAndOp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAndOp(AAndOp node)
    {
    	for(int i=0;i<indent;i++) System.out.print(" ");
    	indent++;
    	System.out.println("(And");
    	
        inAAndOp(node);
        if(node.getAnd() != null)
        {
            node.getAnd().apply(this);
        }
        outAAndOp(node);
    }

    public void inALessthanOp(ALessthanOp node)
    {
        defaultIn(node);
    }

    public void outALessthanOp(ALessthanOp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALessthanOp(ALessthanOp node)
    {
    	for(int i=0;i<indent;i++) System.out.print(" ");
    	indent++;
    	System.out.println("(LessThan");
    	
        inALessthanOp(node);
        if(node.getLessthan() != null)
        {
            node.getLessthan().apply(this);
        }
        outALessthanOp(node);
        
        //indent--;
        //for(int i=0;i<indent;i++) System.out.print(" ");
        //System.out.println(")");
    }

    public void inAPlusOp(APlusOp node)
    {
        defaultIn(node);
    }

    public void outAPlusOp(APlusOp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlusOp(APlusOp node)
    {
    	for(int i=0;i<indent;i++) System.out.print(" ");
    	indent++;
    	System.out.println("(Plus");
    	
        inAPlusOp(node);
        if(node.getPlus() != null)
        {
            node.getPlus().apply(this);
        }
        outAPlusOp(node);
    }

    public void inAMinusOp(AMinusOp node)
    {
        defaultIn(node);
    }

    public void outAMinusOp(AMinusOp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMinusOp(AMinusOp node)
    {
    	for(int i=0;i<indent;i++) System.out.print(" ");
    	indent++;
    	System.out.println("(Minus");
    	
        inAMinusOp(node);
        if(node.getMinus() != null)
        {
            node.getMinus().apply(this);
        }
        outAMinusOp(node);
    }

    public void inATimesOp(ATimesOp node)
    {
        defaultIn(node);
    }

    public void outATimesOp(ATimesOp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATimesOp(ATimesOp node)
    {
    	for(int i=0;i<indent;i++) System.out.print(" ");
    	indent++;
    	System.out.println("(Times");
    	
        inATimesOp(node);
        if(node.getTimes() != null)
        {
            node.getTimes().apply(this);
        }
        outATimesOp(node);
    }
}
