/* This file was generated by SableCC (http://www.sablecc.org/). */

package dotparse.node;

import dotparse.analysis.*;

@SuppressWarnings("nls")
public final class ANumberEle extends PEle
{
    private TId _id_;
    private TAssignment _assignment_;
    private TNumber _number_;

    public ANumberEle()
    {
        // Constructor
    }

    public ANumberEle(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TAssignment _assignment_,
        @SuppressWarnings("hiding") TNumber _number_)
    {
        // Constructor
        setId(_id_);

        setAssignment(_assignment_);

        setNumber(_number_);

    }

    @Override
    public Object clone()
    {
        return new ANumberEle(
            cloneNode(this._id_),
            cloneNode(this._assignment_),
            cloneNode(this._number_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANumberEle(this);
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public TAssignment getAssignment()
    {
        return this._assignment_;
    }

    public void setAssignment(TAssignment node)
    {
        if(this._assignment_ != null)
        {
            this._assignment_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._assignment_ = node;
    }

    public TNumber getNumber()
    {
        return this._number_;
    }

    public void setNumber(TNumber node)
    {
        if(this._number_ != null)
        {
            this._number_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._number_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._assignment_)
            + toString(this._number_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._assignment_ == child)
        {
            this._assignment_ = null;
            return;
        }

        if(this._number_ == child)
        {
            this._number_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._assignment_ == oldChild)
        {
            setAssignment((TAssignment) newChild);
            return;
        }

        if(this._number_ == oldChild)
        {
            setNumber((TNumber) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}