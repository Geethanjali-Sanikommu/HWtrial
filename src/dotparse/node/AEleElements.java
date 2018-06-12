/* This file was generated by SableCC (http://www.sablecc.org/). */

package dotparse.node;

import dotparse.analysis.*;

@SuppressWarnings("nls")
public final class AEleElements extends PElements
{
    private PEle _ele_;

    public AEleElements()
    {
        // Constructor
    }

    public AEleElements(
        @SuppressWarnings("hiding") PEle _ele_)
    {
        // Constructor
        setEle(_ele_);

    }

    @Override
    public Object clone()
    {
        return new AEleElements(
            cloneNode(this._ele_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEleElements(this);
    }

    public PEle getEle()
    {
        return this._ele_;
    }

    public void setEle(PEle node)
    {
        if(this._ele_ != null)
        {
            this._ele_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ele_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._ele_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._ele_ == child)
        {
            this._ele_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._ele_ == oldChild)
        {
            setEle((PEle) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}