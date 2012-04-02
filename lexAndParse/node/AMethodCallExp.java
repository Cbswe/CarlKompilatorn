/* This file was generated by SableCC (http://www.sablecc.org/). */

package lexAndParse.node;

import lexAndParse.analysis.*;

@SuppressWarnings("nls")
public final class AMethodCallExp extends PExp
{
    private PHexp _hexp_;
    private TDot _dot_;
    private PIdentifier _identifier_;
    private TLPar _lPar_;
    private PExplist _explist_;
    private TRPar _rPar_;

    public AMethodCallExp()
    {
        // Constructor
    }

    public AMethodCallExp(
        @SuppressWarnings("hiding") PHexp _hexp_,
        @SuppressWarnings("hiding") TDot _dot_,
        @SuppressWarnings("hiding") PIdentifier _identifier_,
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") PExplist _explist_,
        @SuppressWarnings("hiding") TRPar _rPar_)
    {
        // Constructor
        setHexp(_hexp_);

        setDot(_dot_);

        setIdentifier(_identifier_);

        setLPar(_lPar_);

        setExplist(_explist_);

        setRPar(_rPar_);

    }

    @Override
    public Object clone()
    {
        return new AMethodCallExp(
            cloneNode(this._hexp_),
            cloneNode(this._dot_),
            cloneNode(this._identifier_),
            cloneNode(this._lPar_),
            cloneNode(this._explist_),
            cloneNode(this._rPar_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMethodCallExp(this);
    }

    public PHexp getHexp()
    {
        return this._hexp_;
    }

    public void setHexp(PHexp node)
    {
        if(this._hexp_ != null)
        {
            this._hexp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._hexp_ = node;
    }

    public TDot getDot()
    {
        return this._dot_;
    }

    public void setDot(TDot node)
    {
        if(this._dot_ != null)
        {
            this._dot_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dot_ = node;
    }

    public PIdentifier getIdentifier()
    {
        return this._identifier_;
    }

    public void setIdentifier(PIdentifier node)
    {
        if(this._identifier_ != null)
        {
            this._identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identifier_ = node;
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

    public PExplist getExplist()
    {
        return this._explist_;
    }

    public void setExplist(PExplist node)
    {
        if(this._explist_ != null)
        {
            this._explist_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._explist_ = node;
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
            + toString(this._hexp_)
            + toString(this._dot_)
            + toString(this._identifier_)
            + toString(this._lPar_)
            + toString(this._explist_)
            + toString(this._rPar_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._hexp_ == child)
        {
            this._hexp_ = null;
            return;
        }

        if(this._dot_ == child)
        {
            this._dot_ = null;
            return;
        }

        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        if(this._lPar_ == child)
        {
            this._lPar_ = null;
            return;
        }

        if(this._explist_ == child)
        {
            this._explist_ = null;
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
        if(this._hexp_ == oldChild)
        {
            setHexp((PHexp) newChild);
            return;
        }

        if(this._dot_ == oldChild)
        {
            setDot((TDot) newChild);
            return;
        }

        if(this._identifier_ == oldChild)
        {
            setIdentifier((PIdentifier) newChild);
            return;
        }

        if(this._lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
            return;
        }

        if(this._explist_ == oldChild)
        {
            setExplist((PExplist) newChild);
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