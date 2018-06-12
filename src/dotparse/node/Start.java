/* This file was generated by SableCC (http://www.sablecc.org/). */

package dotparse.node;

import dotparse.analysis.*;

@SuppressWarnings("nls")
public final class Start extends Node
{
    private PRoot _pRoot_;
    private EOF _eof_;

    public Start()
    {
        // Empty body
    }

    public Start(
        @SuppressWarnings("hiding") PRoot _pRoot_,
        @SuppressWarnings("hiding") EOF _eof_)
    {
        setPRoot(_pRoot_);
        setEOF(_eof_);
    }

    @Override
    public Object clone()
    {
        return new Start(
            cloneNode(this._pRoot_),
            cloneNode(this._eof_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseStart(this);
    }

    public PRoot getPRoot()
    {
        return this._pRoot_;
    }

    public void setPRoot(PRoot node)
    {
        if(this._pRoot_ != null)
        {
            this._pRoot_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pRoot_ = node;
    }

    public EOF getEOF()
    {
        return this._eof_;
    }

    public void setEOF(EOF node)
    {
        if(this._eof_ != null)
        {
            this._eof_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._eof_ = node;
    }

    @Override
    void removeChild(Node child)
    {
        if(this._pRoot_ == child)
        {
            this._pRoot_ = null;
            return;
        }

        if(this._eof_ == child)
        {
            this._eof_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(Node oldChild, Node newChild)
    {
        if(this._pRoot_ == oldChild)
        {
            setPRoot((PRoot) newChild);
            return;
        }

        if(this._eof_ == oldChild)
        {
            setEOF((EOF) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    public String toString()
    {
        return "" +
            toString(this._pRoot_) +
            toString(this._eof_);
    }
}
