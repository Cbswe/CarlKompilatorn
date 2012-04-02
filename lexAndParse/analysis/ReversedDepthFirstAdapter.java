/* This file was generated by SableCC (http://www.sablecc.org/). */

package lexAndParse.analysis;

import java.util.*;
import lexAndParse.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
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
        node.getEOF().apply(this);
        node.getPProgram().apply(this);
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
        inAProgram(node);
        {
            List<PClassdecl> copy = new ArrayList<PClassdecl>(node.getClassdecl());
            Collections.reverse(copy);
            for(PClassdecl e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getMainclass() != null)
        {
            node.getMainclass().apply(this);
        }
        outAProgram(node);
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
        inAMainclass(node);
        if(node.getOuterR() != null)
        {
            node.getOuterR().apply(this);
        }
        if(node.getInnerR() != null)
        {
            node.getInnerR().apply(this);
        }
        {
            List<PStmt> copy = new ArrayList<PStmt>(node.getStmt());
            Collections.reverse(copy);
            for(PStmt e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PVardecl> copy = new ArrayList<PVardecl>(node.getVardecl());
            Collections.reverse(copy);
            for(PVardecl e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getInnerL() != null)
        {
            node.getInnerL().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getMainargname() != null)
        {
            node.getMainargname().apply(this);
        }
        if(node.getArrR() != null)
        {
            node.getArrR().apply(this);
        }
        if(node.getArrL() != null)
        {
            node.getArrL().apply(this);
        }
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getMain() != null)
        {
            node.getMain().apply(this);
        }
        if(node.getVoid() != null)
        {
            node.getVoid().apply(this);
        }
        if(node.getStatic() != null)
        {
            node.getStatic().apply(this);
        }
        if(node.getPublic() != null)
        {
            node.getPublic().apply(this);
        }
        if(node.getOuterL() != null)
        {
            node.getOuterL().apply(this);
        }
        if(node.getClassname() != null)
        {
            node.getClassname().apply(this);
        }
        if(node.getClasstag() != null)
        {
            node.getClasstag().apply(this);
        }
        outAMainclass(node);
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
        inAClassdecl(node);
        if(node.getRM() != null)
        {
            node.getRM().apply(this);
        }
        {
            List<PMethoddecl> copy = new ArrayList<PMethoddecl>(node.getMethoddecl());
            Collections.reverse(copy);
            for(PMethoddecl e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PVardecl> copy = new ArrayList<PVardecl>(node.getVardecl());
            Collections.reverse(copy);
            for(PVardecl e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getLM() != null)
        {
            node.getLM().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getClasstag() != null)
        {
            node.getClasstag().apply(this);
        }
        outAClassdecl(node);
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
        inAVardecl(node);
        if(node.getSmc() != null)
        {
            node.getSmc().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
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
        inAMethoddecl(node);
        if(node.getRM() != null)
        {
            node.getRM().apply(this);
        }
        if(node.getSmc() != null)
        {
            node.getSmc().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getReturn() != null)
        {
            node.getReturn().apply(this);
        }
        {
            List<PStmt> copy = new ArrayList<PStmt>(node.getStmt());
            Collections.reverse(copy);
            for(PStmt e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PVardecl> copy = new ArrayList<PVardecl>(node.getVardecl());
            Collections.reverse(copy);
            for(PVardecl e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getLM() != null)
        {
            node.getLM().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getFormallist() != null)
        {
            node.getFormallist().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        if(node.getPublic() != null)
        {
            node.getPublic().apply(this);
        }
        outAMethoddecl(node);
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
        inAFormallist(node);
        {
            List<PFormalrest> copy = new ArrayList<PFormalrest>(node.getFormalrest());
            Collections.reverse(copy);
            for(PFormalrest e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        outAFormallist(node);
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
        inAFormalrest(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        outAFormalrest(node);
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
        inAIntArrType(node);
        if(node.getIntArr() != null)
        {
            node.getIntArr().apply(this);
        }
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
        inABooleanType(node);
        if(node.getBoolean() != null)
        {
            node.getBoolean().apply(this);
        }
        outABooleanType(node);
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
        inAIntType(node);
        if(node.getInt() != null)
        {
            node.getInt().apply(this);
        }
        outAIntType(node);
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
        if(node.getRM() != null)
        {
            node.getRM().apply(this);
        }
        if(node.getStmt() != null)
        {
            node.getStmt().apply(this);
        }
        if(node.getLM() != null)
        {
            node.getLM().apply(this);
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
        inAIfStmt(node);
        if(node.getIffalse() != null)
        {
            node.getIffalse().apply(this);
        }
        if(node.getElse() != null)
        {
            node.getElse().apply(this);
        }
        if(node.getIftrue() != null)
        {
            node.getIftrue().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getIf() != null)
        {
            node.getIf().apply(this);
        }
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
        inAWhileStmt(node);
        if(node.getStmt() != null)
        {
            node.getStmt().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getWhile() != null)
        {
            node.getWhile().apply(this);
        }
        outAWhileStmt(node);
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
        inASysoutStmt(node);
        if(node.getSmc() != null)
        {
            node.getSmc().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getSysout() != null)
        {
            node.getSysout().apply(this);
        }
        outASysoutStmt(node);
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
        inAAssignStmt(node);
        if(node.getSmc() != null)
        {
            node.getSmc().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getEq() != null)
        {
            node.getEq().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAAssignStmt(node);
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
        inAIdxAcsStmt(node);
        if(node.getSmc() != null)
        {
            node.getSmc().apply(this);
        }
        if(node.getAssgn() != null)
        {
            node.getAssgn().apply(this);
        }
        if(node.getEq() != null)
        {
            node.getEq().apply(this);
        }
        if(node.getRSq() != null)
        {
            node.getRSq().apply(this);
        }
        if(node.getIdx() != null)
        {
            node.getIdx().apply(this);
        }
        if(node.getLSq() != null)
        {
            node.getLSq().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAIdxAcsStmt(node);
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
        inADoopExp(node);
        if(node.getAssgnfrom() != null)
        {
            node.getAssgnfrom().apply(this);
        }
        if(node.getOp() != null)
        {
            node.getOp().apply(this);
        }
        if(node.getAssgnto() != null)
        {
            node.getAssgnto().apply(this);
        }
        outADoopExp(node);
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
        inAAccessIdxExp(node);
        if(node.getRSq() != null)
        {
            node.getRSq().apply(this);
        }
        if(node.getIdx() != null)
        {
            node.getIdx().apply(this);
        }
        if(node.getLSq() != null)
        {
            node.getLSq().apply(this);
        }
        if(node.getObj() != null)
        {
            node.getObj().apply(this);
        }
        outAAccessIdxExp(node);
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
        inAGetlengthExp(node);
        if(node.getLength() != null)
        {
            node.getLength().apply(this);
        }
        if(node.getDot() != null)
        {
            node.getDot().apply(this);
        }
        if(node.getHexp() != null)
        {
            node.getHexp().apply(this);
        }
        outAGetlengthExp(node);
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
        inAMethodCallExp(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getExplist() != null)
        {
            node.getExplist().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getDot() != null)
        {
            node.getDot().apply(this);
        }
        if(node.getHexp() != null)
        {
            node.getHexp().apply(this);
        }
        outAMethodCallExp(node);
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
        inANegateExp(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getExl() != null)
        {
            node.getExl().apply(this);
        }
        outANegateExp(node);
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
        inAIntLitHexp(node);
        if(node.getIntLit() != null)
        {
            node.getIntLit().apply(this);
        }
        outAIntLitHexp(node);
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
        inATrueHexp(node);
        if(node.getTrue() != null)
        {
            node.getTrue().apply(this);
        }
        outATrueHexp(node);
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
        inAFalseHexp(node);
        if(node.getFalse() != null)
        {
            node.getFalse().apply(this);
        }
        outAFalseHexp(node);
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
        inAThisHexp(node);
        if(node.getThis() != null)
        {
            node.getThis().apply(this);
        }
        outAThisHexp(node);
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
        inAIntArrHexp(node);
        if(node.getRSq() != null)
        {
            node.getRSq().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getLSq() != null)
        {
            node.getLSq().apply(this);
        }
        if(node.getInt() != null)
        {
            node.getInt().apply(this);
        }
        if(node.getNew() != null)
        {
            node.getNew().apply(this);
        }
        outAIntArrHexp(node);
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
        inAConstructorHexp(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getNew() != null)
        {
            node.getNew().apply(this);
        }
        outAConstructorHexp(node);
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
        inAParanthesisHexp(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
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
        {
            List<PExprest> copy = new ArrayList<PExprest>(node.getExprest());
            Collections.reverse(copy);
            for(PExprest e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
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
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
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
        inAIdentifier(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdentifier(node);
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
        inALessthanOp(node);
        if(node.getLessthan() != null)
        {
            node.getLessthan().apply(this);
        }
        outALessthanOp(node);
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
        inATimesOp(node);
        if(node.getTimes() != null)
        {
            node.getTimes().apply(this);
        }
        outATimesOp(node);
    }
}
