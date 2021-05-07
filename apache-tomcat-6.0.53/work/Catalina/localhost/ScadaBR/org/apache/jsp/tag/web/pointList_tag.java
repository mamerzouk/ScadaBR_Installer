package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.serotonin.mango.Common;

public final class pointList_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tld/mango.tld");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
    _jspx_dependants.add("/WEB-INF/tags/help.tag");
  }

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public void setJspContext(JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public JspContext getJspContext() {
    return this.jspContext;
  }
  private java.lang.String pointHelpId;

  public java.lang.String getPointHelpId() {
    return this.pointHelpId;
  }

  public void setPointHelpId(java.lang.String pointHelpId) {
    this.pointHelpId = pointHelpId;
    jspContext.setAttribute("pointHelpId", pointHelpId);
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) config.getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.release();
  }

  public void doTag() throws JspException, java.io.IOException {
    PageContext _jspx_page_context = (PageContext)jspContext;
    HttpServletRequest request = (HttpServletRequest) _jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse) _jspx_page_context.getResponse();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    ServletConfig config = _jspx_page_context.getServletConfig();
    JspWriter out = jspContext.getOut();
    _jspInit(config);
    jspContext.getELContext().putContext(JspContext.class,jspContext);
    if( getPointHelpId() != null ) 
      _jspx_page_context.setAttribute("pointHelpId", getPointHelpId());

    try {
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\" \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table cellpadding=\"0\" cellspacing=\"0\" id=\"pointProperties\" style=\"display:none;\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td valign=\"top\">\r\n");
      out.write("      <div class=\"borderDiv marR marB\">\r\n");
      out.write("        <table width=\"100%\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td class=\"smallTitle\">");
      if (_jspx_meth_fmt_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("            <td align=\"right\">\r\n");
      out.write("            ");
      if (_jspx_meth_tag_005fimg_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("              ");
      if (_jspx_meth_tag_005fimg_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        <table cellspacing=\"1\">\r\n");
      out.write("          <tr class=\"rowHeader\" id=\"pointListHeaders\"></tr>\r\n");
      out.write("          <tbody id=\"pointsList\"></tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("      </div>\r\n");
      out.write("    </td>\r\n");
      out.write("\r\n");
      out.write("    <td valign=\"top\">\r\n");
      out.write("      <div id=\"pointDetails\" class=\"borderDiv marB\" style=\"display: none;\">\r\n");
      out.write("        <table width=\"100%\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>\r\n");
      out.write("              <span class=\"smallTitle\">");
      if (_jspx_meth_fmt_005fmessage_005f1(_jspx_page_context))
        return;
      out.write("</span>\r\n");
      out.write("              ");
      if (_jspx_meth_tag_005fhelp_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </td>\r\n");
      out.write("            <td align=\"right\">\r\n");
      out.write("              ");
      if (_jspx_meth_tag_005fimg_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("              ");
      if (_jspx_meth_tag_005fimg_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        <div id=\"pointMessage\" class=\"ctxmsg formError\"></div>\r\n");
      out.write("        \r\n");
      out.write("        <table>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f2(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("            <td class=\"formField\"><input type=\"text\" id=\"name\"/></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f3(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("            <td class=\"formField\"><input type=\"text\" id=\"xid\"/></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          \r\n");
      out.write("          ");
      ((org.apache.jasper.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getJspBody() != null)
        getJspBody().invoke(_jspx_sout);
      jspContext.getELContext().putContext(JspContext.class,getJspContext());
      out.write("\r\n");
      out.write("          \r\n");
      out.write("        </table>\r\n");
      out.write("      </div>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>");
    } catch( Throwable t ) {
      if( t instanceof SkipPageException )
          throw (SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof IllegalStateException )
          throw (IllegalStateException) t;
      if( t instanceof JspException )
          throw (JspException) t;
      throw new JspException(t);
    } finally {
      jspContext.getELContext().putContext(JspContext.class,super.getJspContext());
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
      _jspDestroy();
    }
  }

  private boolean _jspx_meth_fmt_005fmessage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f0_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/pointList.tag(30,35) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f0.setKey("dsEdit.points.points");
      int _jspx_eval_fmt_005fmessage_005f0 = _jspx_th_fmt_005fmessage_005f0.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
      _jspx_th_fmt_005fmessage_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f0, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f0 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f0);
    _jspx_th_tag_005fimg_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/pointList.tag(32,12) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f0.setId("enableAllImg");
    // /WEB-INF/tags/pointList.tag(32,12) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f0.setPng("icon_ds_go");
    // /WEB-INF/tags/pointList.tag(32,12) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f0.setOnclick("enableAllPoints()");
    // /WEB-INF/tags/pointList.tag(32,12) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f0.setTitle("common.enableAll");
    _jspx_th_tag_005fimg_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f0);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f1(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f1 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f1);
    _jspx_th_tag_005fimg_005f1.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/pointList.tag(34,14) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f1.setId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("editImg${applicationScope['constants.Common.NEW_ID']}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
    // /WEB-INF/tags/pointList.tag(34,14) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f1.setPng("icon_comp_add");
    // /WEB-INF/tags/pointList.tag(34,14) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f1.setOnclick((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("editPoint(${applicationScope['constants.Common.NEW_ID']})", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
    _jspx_th_tag_005fimg_005f1.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f1);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f1(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f1_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f1.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/pointList.tag(51,39) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f1.setKey("dsEdit.points.details");
      int _jspx_eval_fmt_005fmessage_005f1 = _jspx_th_fmt_005fmessage_005f1.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f1);
      _jspx_th_fmt_005fmessage_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f1, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fhelp_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:help
    org.apache.jsp.tag.web.help_tag _jspx_th_tag_005fhelp_005f0 = new org.apache.jsp.tag.web.help_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fhelp_005f0);
    _jspx_th_tag_005fhelp_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fhelp_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/pointList.tag(52,14) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fhelp_005f0.setId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pointHelpId}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
    _jspx_th_tag_005fhelp_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fhelp_005f0);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f2(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f2 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f2);
    _jspx_th_tag_005fimg_005f2.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/pointList.tag(55,14) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f2.setId("pointSaveImg");
    // /WEB-INF/tags/pointList.tag(55,14) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f2.setPng("save");
    // /WEB-INF/tags/pointList.tag(55,14) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f2.setOnclick("savePoint()");
    // /WEB-INF/tags/pointList.tag(55,14) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f2.setTitle("common.save");
    _jspx_th_tag_005fimg_005f2.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f2);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f3(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f3 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f3);
    _jspx_th_tag_005fimg_005f3.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/pointList.tag(56,14) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f3.setId("pointDeleteImg");
    // /WEB-INF/tags/pointList.tag(56,14) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f3.setPng("delete");
    // /WEB-INF/tags/pointList.tag(56,14) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f3.setOnclick("deletePoint()");
    // /WEB-INF/tags/pointList.tag(56,14) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f3.setTitle("common.delete");
    _jspx_th_tag_005fimg_005f3.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f3);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f2(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f2_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f2.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/pointList.tag(64,42) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f2.setKey("dsEdit.points.name");
      int _jspx_eval_fmt_005fmessage_005f2 = _jspx_th_fmt_005fmessage_005f2.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f2);
      _jspx_th_fmt_005fmessage_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f2, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f3(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f3 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f3_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f3.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/pointList.tag(68,42) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f3.setKey("common.xid");
      int _jspx_eval_fmt_005fmessage_005f3 = _jspx_th_fmt_005fmessage_005f3.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f3);
      _jspx_th_fmt_005fmessage_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f3, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f3_reused);
    }
    return false;
  }
}
