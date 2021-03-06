/* This file was generated by SableCC (http://www.sablecc.org/). */

package lexAndParse.node;

import lexAndParse.analysis.*;

@SuppressWarnings("nls")
public final class AIntArrHexp extends PHexp
{
    private TNew _new_;
    private TInt _int_;
    private TLSq _lSq_;
    private PExp _exp_;
    private TRSq _rSq_;

    public AIntArrHexp()
    {
        // Constructor
    }

    public AIntArrHexp(
        @SuppressWarnings("hiding") TNew _new_,
        @SuppressWarnings("hiding") TInt _int_,
        @SuppressWarnings("hiding") TLSq _lSq_,
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TRSq _rSq_)
    {
        // Constructor
        setNew(_new_);

        setInt(_int_);

        setLSq(_lSq_);

        setExp(_exp_);

        setRSq(_rSq_);

    }

    @Override
    public Object clone()
    {
        return new AIntArrHexp(
            cloneNode(this._new_),
            cloneNode(this._int_),
            cloneNode(this._lSq_),
            cloneNode(this._exp_),
            cloneNode(this._rSq_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIntArrHexp(this);
    }

    public TNew getNew()
    {
        return this._new_;
    }

    public void setNew(TNew node)
    {
        if(this._new_ != null)
        {
            this._new_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._new_ = node;
    }

    public TInt getInt()
    {
        return this._int_;
    }

    public void setInt(TInt node)
    {
        if(this._int_ != null)
        {
            this._int_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._int_ = node;
    }

    public TLSq getLSq()
    {
        return this._lSq_;
    }

    public void setLSq(TLSq node)
    {
        if(this._lSq_ != null)
        {
            this._lSq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lSq_ = node;
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

    public TRSq getRSq()
    {
        return this._rSq_;
    }

    public void setRSq(TRSq node)
    {
        if(this._rSq_ != null)
        {
            this._rSq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rSq_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._new_)
            + toString(this._int_)
            + toString(this._lSq_)
            + toString(this._exp_)
            + toString(this._rSq_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._new_ == child)
        {
            this._new_ = null;
            return;
        }

        if(this._int_ == child)
        {
            this._int_ = null;
            return;
        }

        if(this._lSq_ == child)
        {
            this._lSq_ = null;
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._rSq_ == child)
        {
            this._rSq_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._new_ == oldChild)
        {
            setNew((TNew) newChild);
            return;
        }

        if(this._int_ == oldChild)
        {
            setInt((TInt) newChild);
            return;
        }

        if(this._lSq_ == oldChild)
        {
            setLSq((TLSq) newChild);
            return;
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(this._rSq_ == oldChild)
        {
            setRSq((TRSq) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
