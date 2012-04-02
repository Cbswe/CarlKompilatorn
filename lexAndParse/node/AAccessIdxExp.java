/* This file was generated by SableCC (http://www.sablecc.org/). */

package lexAndParse.node;

import lexAndParse.analysis.*;

@SuppressWarnings("nls")
public final class AAccessIdxExp extends PExp
{
    private PHexp _obj_;
    private TLSq _lSq_;
    private PHexp _idx_;
    private TRSq _rSq_;

    public AAccessIdxExp()
    {
        // Constructor
    }

    public AAccessIdxExp(
        @SuppressWarnings("hiding") PHexp _obj_,
        @SuppressWarnings("hiding") TLSq _lSq_,
        @SuppressWarnings("hiding") PHexp _idx_,
        @SuppressWarnings("hiding") TRSq _rSq_)
    {
        // Constructor
        setObj(_obj_);

        setLSq(_lSq_);

        setIdx(_idx_);

        setRSq(_rSq_);

    }

    @Override
    public Object clone()
    {
        return new AAccessIdxExp(
            cloneNode(this._obj_),
            cloneNode(this._lSq_),
            cloneNode(this._idx_),
            cloneNode(this._rSq_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAccessIdxExp(this);
    }

    public PHexp getObj()
    {
        return this._obj_;
    }

    public void setObj(PHexp node)
    {
        if(this._obj_ != null)
        {
            this._obj_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._obj_ = node;
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

    public PHexp getIdx()
    {
        return this._idx_;
    }

    public void setIdx(PHexp node)
    {
        if(this._idx_ != null)
        {
            this._idx_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._idx_ = node;
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
            + toString(this._obj_)
            + toString(this._lSq_)
            + toString(this._idx_)
            + toString(this._rSq_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._obj_ == child)
        {
            this._obj_ = null;
            return;
        }

        if(this._lSq_ == child)
        {
            this._lSq_ = null;
            return;
        }

        if(this._idx_ == child)
        {
            this._idx_ = null;
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
        if(this._obj_ == oldChild)
        {
            setObj((PHexp) newChild);
            return;
        }

        if(this._lSq_ == oldChild)
        {
            setLSq((TLSq) newChild);
            return;
        }

        if(this._idx_ == oldChild)
        {
            setIdx((PHexp) newChild);
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
