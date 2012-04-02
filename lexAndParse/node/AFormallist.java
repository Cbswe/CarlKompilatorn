/* This file was generated by SableCC (http://www.sablecc.org/). */

package lexAndParse.node;

import java.util.*;
import lexAndParse.analysis.*;

@SuppressWarnings("nls")
public final class AFormallist extends PFormallist
{
    private PType _type_;
    private PIdentifier _identifier_;
    private final LinkedList<PFormalrest> _formalrest_ = new LinkedList<PFormalrest>();

    public AFormallist()
    {
        // Constructor
    }

    public AFormallist(
        @SuppressWarnings("hiding") PType _type_,
        @SuppressWarnings("hiding") PIdentifier _identifier_,
        @SuppressWarnings("hiding") List<PFormalrest> _formalrest_)
    {
        // Constructor
        setType(_type_);

        setIdentifier(_identifier_);

        setFormalrest(_formalrest_);

    }

    @Override
    public Object clone()
    {
        return new AFormallist(
            cloneNode(this._type_),
            cloneNode(this._identifier_),
            cloneList(this._formalrest_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFormallist(this);
    }

    public PType getType()
    {
        return this._type_;
    }

    public void setType(PType node)
    {
        if(this._type_ != null)
        {
            this._type_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._type_ = node;
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

    public LinkedList<PFormalrest> getFormalrest()
    {
        return this._formalrest_;
    }

    public void setFormalrest(List<PFormalrest> list)
    {
        this._formalrest_.clear();
        this._formalrest_.addAll(list);
        for(PFormalrest e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._type_)
            + toString(this._identifier_)
            + toString(this._formalrest_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._type_ == child)
        {
            this._type_ = null;
            return;
        }

        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        if(this._formalrest_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._type_ == oldChild)
        {
            setType((PType) newChild);
            return;
        }

        if(this._identifier_ == oldChild)
        {
            setIdentifier((PIdentifier) newChild);
            return;
        }

        for(ListIterator<PFormalrest> i = this._formalrest_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PFormalrest) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}