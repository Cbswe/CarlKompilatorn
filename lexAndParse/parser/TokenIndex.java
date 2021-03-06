/* This file was generated by SableCC (http://www.sablecc.org/). */

package lexAndParse.parser;

import lexAndParse.node.*;
import lexAndParse.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTIntLit(@SuppressWarnings("unused") TIntLit node)
    {
        this.index = 0;
    }

    @Override
    public void caseTLongLit(@SuppressWarnings("unused") TLongLit node)
    {
        this.index = 1;
    }

    @Override
    public void caseTLPar(@SuppressWarnings("unused") TLPar node)
    {
        this.index = 2;
    }

    @Override
    public void caseTRPar(@SuppressWarnings("unused") TRPar node)
    {
        this.index = 3;
    }

    @Override
    public void caseTLSq(@SuppressWarnings("unused") TLSq node)
    {
        this.index = 4;
    }

    @Override
    public void caseTRSq(@SuppressWarnings("unused") TRSq node)
    {
        this.index = 5;
    }

    @Override
    public void caseTLM(@SuppressWarnings("unused") TLM node)
    {
        this.index = 6;
    }

    @Override
    public void caseTRM(@SuppressWarnings("unused") TRM node)
    {
        this.index = 7;
    }

    @Override
    public void caseTDot(@SuppressWarnings("unused") TDot node)
    {
        this.index = 8;
    }

    @Override
    public void caseTNew(@SuppressWarnings("unused") TNew node)
    {
        this.index = 9;
    }

    @Override
    public void caseTExl(@SuppressWarnings("unused") TExl node)
    {
        this.index = 10;
    }

    @Override
    public void caseTLength(@SuppressWarnings("unused") TLength node)
    {
        this.index = 11;
    }

    @Override
    public void caseTTrue(@SuppressWarnings("unused") TTrue node)
    {
        this.index = 12;
    }

    @Override
    public void caseTFalse(@SuppressWarnings("unused") TFalse node)
    {
        this.index = 13;
    }

    @Override
    public void caseTThis(@SuppressWarnings("unused") TThis node)
    {
        this.index = 14;
    }

    @Override
    public void caseTInt(@SuppressWarnings("unused") TInt node)
    {
        this.index = 15;
    }

    @Override
    public void caseTComma(@SuppressWarnings("unused") TComma node)
    {
        this.index = 16;
    }

    @Override
    public void caseTIntArr(@SuppressWarnings("unused") TIntArr node)
    {
        this.index = 17;
    }

    @Override
    public void caseTBoolean(@SuppressWarnings("unused") TBoolean node)
    {
        this.index = 18;
    }

    @Override
    public void caseTIf(@SuppressWarnings("unused") TIf node)
    {
        this.index = 19;
    }

    @Override
    public void caseTElse(@SuppressWarnings("unused") TElse node)
    {
        this.index = 20;
    }

    @Override
    public void caseTWhile(@SuppressWarnings("unused") TWhile node)
    {
        this.index = 21;
    }

    @Override
    public void caseTSysout(@SuppressWarnings("unused") TSysout node)
    {
        this.index = 22;
    }

    @Override
    public void caseTEq(@SuppressWarnings("unused") TEq node)
    {
        this.index = 23;
    }

    @Override
    public void caseTSmc(@SuppressWarnings("unused") TSmc node)
    {
        this.index = 24;
    }

    @Override
    public void caseTPublic(@SuppressWarnings("unused") TPublic node)
    {
        this.index = 25;
    }

    @Override
    public void caseTReturn(@SuppressWarnings("unused") TReturn node)
    {
        this.index = 26;
    }

    @Override
    public void caseTClasstag(@SuppressWarnings("unused") TClasstag node)
    {
        this.index = 27;
    }

    @Override
    public void caseTStatic(@SuppressWarnings("unused") TStatic node)
    {
        this.index = 28;
    }

    @Override
    public void caseTVoid(@SuppressWarnings("unused") TVoid node)
    {
        this.index = 29;
    }

    @Override
    public void caseTMain(@SuppressWarnings("unused") TMain node)
    {
        this.index = 30;
    }

    @Override
    public void caseTString(@SuppressWarnings("unused") TString node)
    {
        this.index = 31;
    }

    @Override
    public void caseTAnd(@SuppressWarnings("unused") TAnd node)
    {
        this.index = 32;
    }

    @Override
    public void caseTLessthan(@SuppressWarnings("unused") TLessthan node)
    {
        this.index = 33;
    }

    @Override
    public void caseTPlus(@SuppressWarnings("unused") TPlus node)
    {
        this.index = 34;
    }

    @Override
    public void caseTMinus(@SuppressWarnings("unused") TMinus node)
    {
        this.index = 35;
    }

    @Override
    public void caseTTimes(@SuppressWarnings("unused") TTimes node)
    {
        this.index = 36;
    }

    @Override
    public void caseTId(@SuppressWarnings("unused") TId node)
    {
        this.index = 37;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 38;
    }
}
