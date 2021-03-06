/* This file was generated by SableCC (http://www.sablecc.org/). */

package lexAndParse.node;

import lexAndParse.analysis.*;

@SuppressWarnings("nls")
public final class AExp extends PExp
{
    private PHexp _hexp_;

    public AExp()
    {
        // Constructor
    }

    public AExp(
        @SuppressWarnings("hiding") PHexp _hexp_)
    {
        // Constructor
        setHexp(_hexp_);

    }

    @Override
    public Object clone()
    {
        return new AExp(
            cloneNode(this._hexp_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExp(this);
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._hexp_);
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

        throw new RuntimeException("Not a child.");
    }
}
