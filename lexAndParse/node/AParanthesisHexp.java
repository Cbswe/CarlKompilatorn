/* This file was generated by SableCC (http://www.sablecc.org/). */

package lexAndParse.node;

import lexAndParse.analysis.*;

@SuppressWarnings("nls")
public final class AParanthesisHexp extends PHexp
{
    private TLPar _lPar_;
    private PExp _exp_;
    private TRPar _rPar_;

    public AParanthesisHexp()
    {
        // Constructor
    }

    public AParanthesisHexp(
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TRPar _rPar_)
    {
        // Constructor
        setLPar(_lPar_);

        setExp(_exp_);

        setRPar(_rPar_);

    }

    @Override
    public Object clone()
    {
        return new AParanthesisHexp(
            cloneNode(this._lPar_),
            cloneNode(this._exp_),
            cloneNode(this._rPar_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParanthesisHexp(this);
    }

    public TLPar getLPar()
    {
        return this._lPar_;
    }

    public void setLPar(TLPar node)
    {
        if(this._lPar_ != null)
        {
            this._lPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lPar_ = node;
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    public TRPar getRPar()
    {
        return this._rPar_;
    }

    public void setRPar(TRPar node)
    {
        if(this._rPar_ != null)
        {
            this._rPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rPar_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lPar_)
            + toString(this._exp_)
            + toString(this._rPar_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lPar_ == child)
        {
            this._lPar_ = null;
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._rPar_ == child)
        {
            this._rPar_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
            return;
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(this._rPar_ == oldChild)
        {
            setRPar((TRPar) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
