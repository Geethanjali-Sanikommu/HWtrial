/* This file was generated by SableCC (http://www.sablecc.org/). */

package dotparse.node;

import dotparse.analysis.*;

@SuppressWarnings("nls")
public final class AArrowLine extends PLine
{
    private TId _left_;
    private TArrow _arrow_;
    private TId _right_;
    private PText _text_;
    private PLine _line_;

    public AArrowLine()
    {
        // Constructor
    }

    public AArrowLine(
        @SuppressWarnings("hiding") TId _left_,
        @SuppressWarnings("hiding") TArrow _arrow_,
        @SuppressWarnings("hiding") TId _right_,
        @SuppressWarnings("hiding") PText _text_,
        @SuppressWarnings("hiding") PLine _line_)
    {
        // Constructor
        setLeft(_left_);

        setArrow(_arrow_);

        setRight(_right_);

        setText(_text_);

        setLine(_line_);

    }

    @Override
    public Object clone()
    {
        return new AArrowLine(
            cloneNode(this._left_),
            cloneNode(this._arrow_),
            cloneNode(this._right_),
            cloneNode(this._text_),
            cloneNode(this._line_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArrowLine(this);
    }

    public TId getLeft()
    {
        return this._left_;
    }

    public void setLeft(TId node)
    {
        if(this._left_ != null)
        {
            this._left_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._left_ = node;
    }

    public TArrow getArrow()
    {
        return this._arrow_;
    }

    public void setArrow(TArrow node)
    {
        if(this._arrow_ != null)
        {
            this._arrow_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._arrow_ = node;
    }

    public TId getRight()
    {
        return this._right_;
    }

    public void setRight(TId node)
    {
        if(this._right_ != null)
        {
            this._right_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._right_ = node;
    }

    public PText getText()
    {
        return this._text_;
    }

    public void setText(PText node)
    {
        if(this._text_ != null)
        {
            this._text_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._text_ = node;
    }

    public PLine getLine()
    {
        return this._line_;
    }

    public void setLine(PLine node)
    {
        if(this._line_ != null)
        {
            this._line_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._line_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._left_)
            + toString(this._arrow_)
            + toString(this._right_)
            + toString(this._text_)
            + toString(this._line_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._left_ == child)
        {
            this._left_ = null;
            return;
        }

        if(this._arrow_ == child)
        {
            this._arrow_ = null;
            return;
        }

        if(this._right_ == child)
        {
            this._right_ = null;
            return;
        }

        if(this._text_ == child)
        {
            this._text_ = null;
            return;
        }

        if(this._line_ == child)
        {
            this._line_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._left_ == oldChild)
        {
            setLeft((TId) newChild);
            return;
        }

        if(this._arrow_ == oldChild)
        {
            setArrow((TArrow) newChild);
            return;
        }

        if(this._right_ == oldChild)
        {
            setRight((TId) newChild);
            return;
        }

        if(this._text_ == oldChild)
        {
            setText((PText) newChild);
            return;
        }

        if(this._line_ == oldChild)
        {
            setLine((PLine) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
