package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dateRange_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(7);
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tld/mango.tld");
    _jspx_dependants.add("/WEB-INF/tags/monthOptions.tag");
    _jspx_dependants.add("/WEB-INF/tags/dayOptions.tag");
    _jspx_dependants.add("/WEB-INF/tags/hourOptions.tag");
    _jspx_dependants.add("/WEB-INF/tags/minuteOptions.tag");
    _jspx_dependants.add("/WEB-INF/tags/secondOptions.tag");
  }

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsst_005fselect_0026_005fvalue_005fid;

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

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fsst_005fselect_0026_005fvalue_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) config.getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fsst_005fselect_0026_005fvalue_005fid.release();
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

    try {
      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>");
      if (_jspx_meth_fmt_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("    <td><input type=\"text\" id=\"fromYear\" class=\"formVeryShort\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fromYear}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("\"/></td>\r\n");
      out.write("    <td>");
      if (_jspx_meth_sst_005fselect_005f0(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("    <td>");
      if (_jspx_meth_sst_005fselect_005f1(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("    <td>,</td>\r\n");
      out.write("    <td>");
      if (_jspx_meth_sst_005fselect_005f2(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("    <td>:</td>\r\n");
      out.write("    <td>");
      if (_jspx_meth_sst_005fselect_005f3(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("    <td>:</td>\r\n");
      out.write("    <td>");
      if (_jspx_meth_sst_005fselect_005f4(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("    <td><input type=\"checkbox\" name=\"fromNone\" id=\"fromNone\" onclick=\"updateDateRange()\"/><label\r\n");
      out.write("            for=\"fromNone\">");
      if (_jspx_meth_fmt_005fmessage_005f1(_jspx_page_context))
        return;
      out.write("</label></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>");
      if (_jspx_meth_fmt_005fmessage_005f2(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("    <td><input type=\"text\" id=\"toYear\" class=\"formVeryShort\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${toYear}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("\"/></td>\r\n");
      out.write("    <td>");
      if (_jspx_meth_sst_005fselect_005f5(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("    <td>");
      if (_jspx_meth_sst_005fselect_005f6(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("    <td>,</td>\r\n");
      out.write("    <td>");
      if (_jspx_meth_sst_005fselect_005f7(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("    <td>:</td>\r\n");
      out.write("    <td>");
      if (_jspx_meth_sst_005fselect_005f8(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("    <td>:</td>\r\n");
      out.write("    <td>");
      if (_jspx_meth_sst_005fselect_005f9(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("    <td><input type=\"checkbox\" name=\"toNone\" id=\"toNone\" checked=\"checked\" onclick=\"updateDateRange()\"/><label\r\n");
      out.write("            for=\"toNone\">");
      if (_jspx_meth_fmt_005fmessage_005f3(_jspx_page_context))
        return;
      out.write("</label></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
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
      _jspx_th_fmt_005fmessage_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/dateRange.tag(22,8) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f0.setKey("common.dateRangeFrom");
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

  private boolean _jspx_meth_sst_005fselect_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  sst:select
    com.serotonin.web.taglib.SelectTag _jspx_th_sst_005fselect_005f0 = (com.serotonin.web.taglib.SelectTag) _005fjspx_005ftagPool_005fsst_005fselect_0026_005fvalue_005fid.get(com.serotonin.web.taglib.SelectTag.class);
    boolean _jspx_th_sst_005fselect_005f0_reused = false;
    try {
      _jspx_th_sst_005fselect_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sst_005fselect_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/dateRange.tag(24,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fselect_005f0.setId("fromMonth");
      // /WEB-INF/tags/dateRange.tag(24,8) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fselect_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fromMonth}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      int _jspx_eval_sst_005fselect_005f0 = _jspx_th_sst_005fselect_005f0.doStartTag();
      if (_jspx_eval_sst_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_tag_005fmonthOptions_005f0(_jspx_th_sst_005fselect_005f0, _jspx_page_context))
            return true;
          int evalDoAfterBody = _jspx_th_sst_005fselect_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_sst_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fsst_005fselect_0026_005fvalue_005fid.reuse(_jspx_th_sst_005fselect_005f0);
      _jspx_th_sst_005fselect_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sst_005fselect_005f0, _jsp_annotationprocessor, _jspx_th_sst_005fselect_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fmonthOptions_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_005fselect_005f0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:monthOptions
    org.apache.jsp.tag.web.monthOptions_tag _jspx_th_tag_005fmonthOptions_005f0 = new org.apache.jsp.tag.web.monthOptions_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fmonthOptions_005f0);
    _jspx_th_tag_005fmonthOptions_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fmonthOptions_005f0.setParent(_jspx_th_sst_005fselect_005f0);
    // /WEB-INF/tags/dateRange.tag(24,56) name = sst type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmonthOptions_005f0.setSst(new Boolean(true));
    _jspx_th_tag_005fmonthOptions_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fmonthOptions_005f0);
    return false;
  }

  private boolean _jspx_meth_sst_005fselect_005f1(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  sst:select
    com.serotonin.web.taglib.SelectTag _jspx_th_sst_005fselect_005f1 = (com.serotonin.web.taglib.SelectTag) _005fjspx_005ftagPool_005fsst_005fselect_0026_005fvalue_005fid.get(com.serotonin.web.taglib.SelectTag.class);
    boolean _jspx_th_sst_005fselect_005f1_reused = false;
    try {
      _jspx_th_sst_005fselect_005f1.setPageContext(_jspx_page_context);
      _jspx_th_sst_005fselect_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/dateRange.tag(25,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fselect_005f1.setId("fromDay");
      // /WEB-INF/tags/dateRange.tag(25,8) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fselect_005f1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fromDay}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      int _jspx_eval_sst_005fselect_005f1 = _jspx_th_sst_005fselect_005f1.doStartTag();
      if (_jspx_eval_sst_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_tag_005fdayOptions_005f0(_jspx_th_sst_005fselect_005f1, _jspx_page_context))
            return true;
          int evalDoAfterBody = _jspx_th_sst_005fselect_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_sst_005fselect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fsst_005fselect_0026_005fvalue_005fid.reuse(_jspx_th_sst_005fselect_005f1);
      _jspx_th_sst_005fselect_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sst_005fselect_005f1, _jsp_annotationprocessor, _jspx_th_sst_005fselect_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fdayOptions_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_005fselect_005f1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:dayOptions
    org.apache.jsp.tag.web.dayOptions_tag _jspx_th_tag_005fdayOptions_005f0 = new org.apache.jsp.tag.web.dayOptions_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fdayOptions_005f0);
    _jspx_th_tag_005fdayOptions_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fdayOptions_005f0.setParent(_jspx_th_sst_005fselect_005f1);
    // /WEB-INF/tags/dateRange.tag(25,52) name = sst type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fdayOptions_005f0.setSst(new Boolean(true));
    _jspx_th_tag_005fdayOptions_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fdayOptions_005f0);
    return false;
  }

  private boolean _jspx_meth_sst_005fselect_005f2(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  sst:select
    com.serotonin.web.taglib.SelectTag _jspx_th_sst_005fselect_005f2 = (com.serotonin.web.taglib.SelectTag) _005fjspx_005ftagPool_005fsst_005fselect_0026_005fvalue_005fid.get(com.serotonin.web.taglib.SelectTag.class);
    boolean _jspx_th_sst_005fselect_005f2_reused = false;
    try {
      _jspx_th_sst_005fselect_005f2.setPageContext(_jspx_page_context);
      _jspx_th_sst_005fselect_005f2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/dateRange.tag(27,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fselect_005f2.setId("fromHour");
      // /WEB-INF/tags/dateRange.tag(27,8) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fselect_005f2.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fromHour}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      int _jspx_eval_sst_005fselect_005f2 = _jspx_th_sst_005fselect_005f2.doStartTag();
      if (_jspx_eval_sst_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_tag_005fhourOptions_005f0(_jspx_th_sst_005fselect_005f2, _jspx_page_context))
            return true;
          int evalDoAfterBody = _jspx_th_sst_005fselect_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_sst_005fselect_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fsst_005fselect_0026_005fvalue_005fid.reuse(_jspx_th_sst_005fselect_005f2);
      _jspx_th_sst_005fselect_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sst_005fselect_005f2, _jsp_annotationprocessor, _jspx_th_sst_005fselect_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fhourOptions_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_005fselect_005f2, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:hourOptions
    org.apache.jsp.tag.web.hourOptions_tag _jspx_th_tag_005fhourOptions_005f0 = new org.apache.jsp.tag.web.hourOptions_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fhourOptions_005f0);
    _jspx_th_tag_005fhourOptions_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fhourOptions_005f0.setParent(_jspx_th_sst_005fselect_005f2);
    // /WEB-INF/tags/dateRange.tag(27,54) name = sst type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fhourOptions_005f0.setSst(new Boolean(true));
    _jspx_th_tag_005fhourOptions_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fhourOptions_005f0);
    return false;
  }

  private boolean _jspx_meth_sst_005fselect_005f3(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  sst:select
    com.serotonin.web.taglib.SelectTag _jspx_th_sst_005fselect_005f3 = (com.serotonin.web.taglib.SelectTag) _005fjspx_005ftagPool_005fsst_005fselect_0026_005fvalue_005fid.get(com.serotonin.web.taglib.SelectTag.class);
    boolean _jspx_th_sst_005fselect_005f3_reused = false;
    try {
      _jspx_th_sst_005fselect_005f3.setPageContext(_jspx_page_context);
      _jspx_th_sst_005fselect_005f3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/dateRange.tag(29,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fselect_005f3.setId("fromMinute");
      // /WEB-INF/tags/dateRange.tag(29,8) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fselect_005f3.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fromMinute}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      int _jspx_eval_sst_005fselect_005f3 = _jspx_th_sst_005fselect_005f3.doStartTag();
      if (_jspx_eval_sst_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_tag_005fminuteOptions_005f0(_jspx_th_sst_005fselect_005f3, _jspx_page_context))
            return true;
          int evalDoAfterBody = _jspx_th_sst_005fselect_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_sst_005fselect_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fsst_005fselect_0026_005fvalue_005fid.reuse(_jspx_th_sst_005fselect_005f3);
      _jspx_th_sst_005fselect_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sst_005fselect_005f3, _jsp_annotationprocessor, _jspx_th_sst_005fselect_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fminuteOptions_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_005fselect_005f3, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:minuteOptions
    org.apache.jsp.tag.web.minuteOptions_tag _jspx_th_tag_005fminuteOptions_005f0 = new org.apache.jsp.tag.web.minuteOptions_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fminuteOptions_005f0);
    _jspx_th_tag_005fminuteOptions_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fminuteOptions_005f0.setParent(_jspx_th_sst_005fselect_005f3);
    // /WEB-INF/tags/dateRange.tag(29,58) name = sst type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fminuteOptions_005f0.setSst(new Boolean(true));
    _jspx_th_tag_005fminuteOptions_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fminuteOptions_005f0);
    return false;
  }

  private boolean _jspx_meth_sst_005fselect_005f4(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  sst:select
    com.serotonin.web.taglib.SelectTag _jspx_th_sst_005fselect_005f4 = (com.serotonin.web.taglib.SelectTag) _005fjspx_005ftagPool_005fsst_005fselect_0026_005fvalue_005fid.get(com.serotonin.web.taglib.SelectTag.class);
    boolean _jspx_th_sst_005fselect_005f4_reused = false;
    try {
      _jspx_th_sst_005fselect_005f4.setPageContext(_jspx_page_context);
      _jspx_th_sst_005fselect_005f4.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/dateRange.tag(31,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fselect_005f4.setId("fromSecond");
      // /WEB-INF/tags/dateRange.tag(31,8) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fselect_005f4.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fromSecond}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      int _jspx_eval_sst_005fselect_005f4 = _jspx_th_sst_005fselect_005f4.doStartTag();
      if (_jspx_eval_sst_005fselect_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_tag_005fsecondOptions_005f0(_jspx_th_sst_005fselect_005f4, _jspx_page_context))
            return true;
          int evalDoAfterBody = _jspx_th_sst_005fselect_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_sst_005fselect_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fsst_005fselect_0026_005fvalue_005fid.reuse(_jspx_th_sst_005fselect_005f4);
      _jspx_th_sst_005fselect_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sst_005fselect_005f4, _jsp_annotationprocessor, _jspx_th_sst_005fselect_005f4_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fsecondOptions_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_005fselect_005f4, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:secondOptions
    org.apache.jsp.tag.web.secondOptions_tag _jspx_th_tag_005fsecondOptions_005f0 = new org.apache.jsp.tag.web.secondOptions_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fsecondOptions_005f0);
    _jspx_th_tag_005fsecondOptions_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fsecondOptions_005f0.setParent(_jspx_th_sst_005fselect_005f4);
    // /WEB-INF/tags/dateRange.tag(31,58) name = sst type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fsecondOptions_005f0.setSst(new Boolean(true));
    _jspx_th_tag_005fsecondOptions_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fsecondOptions_005f0);
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
      _jspx_th_fmt_005fmessage_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/dateRange.tag(33,27) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f1.setKey("common.inception");
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

  private boolean _jspx_meth_fmt_005fmessage_005f2(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f2_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f2.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/dateRange.tag(36,8) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f2.setKey("common.dateRangeTo");
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

  private boolean _jspx_meth_sst_005fselect_005f5(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  sst:select
    com.serotonin.web.taglib.SelectTag _jspx_th_sst_005fselect_005f5 = (com.serotonin.web.taglib.SelectTag) _005fjspx_005ftagPool_005fsst_005fselect_0026_005fvalue_005fid.get(com.serotonin.web.taglib.SelectTag.class);
    boolean _jspx_th_sst_005fselect_005f5_reused = false;
    try {
      _jspx_th_sst_005fselect_005f5.setPageContext(_jspx_page_context);
      _jspx_th_sst_005fselect_005f5.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/dateRange.tag(38,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fselect_005f5.setId("toMonth");
      // /WEB-INF/tags/dateRange.tag(38,8) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fselect_005f5.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${toMonth}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      int _jspx_eval_sst_005fselect_005f5 = _jspx_th_sst_005fselect_005f5.doStartTag();
      if (_jspx_eval_sst_005fselect_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_tag_005fmonthOptions_005f1(_jspx_th_sst_005fselect_005f5, _jspx_page_context))
            return true;
          int evalDoAfterBody = _jspx_th_sst_005fselect_005f5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_sst_005fselect_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fsst_005fselect_0026_005fvalue_005fid.reuse(_jspx_th_sst_005fselect_005f5);
      _jspx_th_sst_005fselect_005f5_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sst_005fselect_005f5, _jsp_annotationprocessor, _jspx_th_sst_005fselect_005f5_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fmonthOptions_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_005fselect_005f5, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:monthOptions
    org.apache.jsp.tag.web.monthOptions_tag _jspx_th_tag_005fmonthOptions_005f1 = new org.apache.jsp.tag.web.monthOptions_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fmonthOptions_005f1);
    _jspx_th_tag_005fmonthOptions_005f1.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fmonthOptions_005f1.setParent(_jspx_th_sst_005fselect_005f5);
    // /WEB-INF/tags/dateRange.tag(38,52) name = sst type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fmonthOptions_005f1.setSst(new Boolean(true));
    _jspx_th_tag_005fmonthOptions_005f1.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fmonthOptions_005f1);
    return false;
  }

  private boolean _jspx_meth_sst_005fselect_005f6(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  sst:select
    com.serotonin.web.taglib.SelectTag _jspx_th_sst_005fselect_005f6 = (com.serotonin.web.taglib.SelectTag) _005fjspx_005ftagPool_005fsst_005fselect_0026_005fvalue_005fid.get(com.serotonin.web.taglib.SelectTag.class);
    boolean _jspx_th_sst_005fselect_005f6_reused = false;
    try {
      _jspx_th_sst_005fselect_005f6.setPageContext(_jspx_page_context);
      _jspx_th_sst_005fselect_005f6.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/dateRange.tag(39,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fselect_005f6.setId("toDay");
      // /WEB-INF/tags/dateRange.tag(39,8) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fselect_005f6.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${toDay}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      int _jspx_eval_sst_005fselect_005f6 = _jspx_th_sst_005fselect_005f6.doStartTag();
      if (_jspx_eval_sst_005fselect_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_tag_005fdayOptions_005f1(_jspx_th_sst_005fselect_005f6, _jspx_page_context))
            return true;
          int evalDoAfterBody = _jspx_th_sst_005fselect_005f6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_sst_005fselect_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fsst_005fselect_0026_005fvalue_005fid.reuse(_jspx_th_sst_005fselect_005f6);
      _jspx_th_sst_005fselect_005f6_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sst_005fselect_005f6, _jsp_annotationprocessor, _jspx_th_sst_005fselect_005f6_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fdayOptions_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_005fselect_005f6, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:dayOptions
    org.apache.jsp.tag.web.dayOptions_tag _jspx_th_tag_005fdayOptions_005f1 = new org.apache.jsp.tag.web.dayOptions_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fdayOptions_005f1);
    _jspx_th_tag_005fdayOptions_005f1.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fdayOptions_005f1.setParent(_jspx_th_sst_005fselect_005f6);
    // /WEB-INF/tags/dateRange.tag(39,48) name = sst type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fdayOptions_005f1.setSst(new Boolean(true));
    _jspx_th_tag_005fdayOptions_005f1.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fdayOptions_005f1);
    return false;
  }

  private boolean _jspx_meth_sst_005fselect_005f7(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  sst:select
    com.serotonin.web.taglib.SelectTag _jspx_th_sst_005fselect_005f7 = (com.serotonin.web.taglib.SelectTag) _005fjspx_005ftagPool_005fsst_005fselect_0026_005fvalue_005fid.get(com.serotonin.web.taglib.SelectTag.class);
    boolean _jspx_th_sst_005fselect_005f7_reused = false;
    try {
      _jspx_th_sst_005fselect_005f7.setPageContext(_jspx_page_context);
      _jspx_th_sst_005fselect_005f7.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/dateRange.tag(41,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fselect_005f7.setId("toHour");
      // /WEB-INF/tags/dateRange.tag(41,8) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fselect_005f7.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${toHour}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      int _jspx_eval_sst_005fselect_005f7 = _jspx_th_sst_005fselect_005f7.doStartTag();
      if (_jspx_eval_sst_005fselect_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_tag_005fhourOptions_005f1(_jspx_th_sst_005fselect_005f7, _jspx_page_context))
            return true;
          int evalDoAfterBody = _jspx_th_sst_005fselect_005f7.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_sst_005fselect_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fsst_005fselect_0026_005fvalue_005fid.reuse(_jspx_th_sst_005fselect_005f7);
      _jspx_th_sst_005fselect_005f7_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sst_005fselect_005f7, _jsp_annotationprocessor, _jspx_th_sst_005fselect_005f7_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fhourOptions_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_005fselect_005f7, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:hourOptions
    org.apache.jsp.tag.web.hourOptions_tag _jspx_th_tag_005fhourOptions_005f1 = new org.apache.jsp.tag.web.hourOptions_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fhourOptions_005f1);
    _jspx_th_tag_005fhourOptions_005f1.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fhourOptions_005f1.setParent(_jspx_th_sst_005fselect_005f7);
    // /WEB-INF/tags/dateRange.tag(41,50) name = sst type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fhourOptions_005f1.setSst(new Boolean(true));
    _jspx_th_tag_005fhourOptions_005f1.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fhourOptions_005f1);
    return false;
  }

  private boolean _jspx_meth_sst_005fselect_005f8(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  sst:select
    com.serotonin.web.taglib.SelectTag _jspx_th_sst_005fselect_005f8 = (com.serotonin.web.taglib.SelectTag) _005fjspx_005ftagPool_005fsst_005fselect_0026_005fvalue_005fid.get(com.serotonin.web.taglib.SelectTag.class);
    boolean _jspx_th_sst_005fselect_005f8_reused = false;
    try {
      _jspx_th_sst_005fselect_005f8.setPageContext(_jspx_page_context);
      _jspx_th_sst_005fselect_005f8.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/dateRange.tag(43,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fselect_005f8.setId("toMinute");
      // /WEB-INF/tags/dateRange.tag(43,8) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fselect_005f8.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${toMinute}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      int _jspx_eval_sst_005fselect_005f8 = _jspx_th_sst_005fselect_005f8.doStartTag();
      if (_jspx_eval_sst_005fselect_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_tag_005fminuteOptions_005f1(_jspx_th_sst_005fselect_005f8, _jspx_page_context))
            return true;
          int evalDoAfterBody = _jspx_th_sst_005fselect_005f8.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_sst_005fselect_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fsst_005fselect_0026_005fvalue_005fid.reuse(_jspx_th_sst_005fselect_005f8);
      _jspx_th_sst_005fselect_005f8_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sst_005fselect_005f8, _jsp_annotationprocessor, _jspx_th_sst_005fselect_005f8_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fminuteOptions_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_005fselect_005f8, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:minuteOptions
    org.apache.jsp.tag.web.minuteOptions_tag _jspx_th_tag_005fminuteOptions_005f1 = new org.apache.jsp.tag.web.minuteOptions_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fminuteOptions_005f1);
    _jspx_th_tag_005fminuteOptions_005f1.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fminuteOptions_005f1.setParent(_jspx_th_sst_005fselect_005f8);
    // /WEB-INF/tags/dateRange.tag(43,54) name = sst type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fminuteOptions_005f1.setSst(new Boolean(true));
    _jspx_th_tag_005fminuteOptions_005f1.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fminuteOptions_005f1);
    return false;
  }

  private boolean _jspx_meth_sst_005fselect_005f9(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  sst:select
    com.serotonin.web.taglib.SelectTag _jspx_th_sst_005fselect_005f9 = (com.serotonin.web.taglib.SelectTag) _005fjspx_005ftagPool_005fsst_005fselect_0026_005fvalue_005fid.get(com.serotonin.web.taglib.SelectTag.class);
    boolean _jspx_th_sst_005fselect_005f9_reused = false;
    try {
      _jspx_th_sst_005fselect_005f9.setPageContext(_jspx_page_context);
      _jspx_th_sst_005fselect_005f9.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/dateRange.tag(45,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fselect_005f9.setId("toSecond");
      // /WEB-INF/tags/dateRange.tag(45,8) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fselect_005f9.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${toSecond}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      int _jspx_eval_sst_005fselect_005f9 = _jspx_th_sst_005fselect_005f9.doStartTag();
      if (_jspx_eval_sst_005fselect_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_tag_005fsecondOptions_005f1(_jspx_th_sst_005fselect_005f9, _jspx_page_context))
            return true;
          int evalDoAfterBody = _jspx_th_sst_005fselect_005f9.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_sst_005fselect_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fsst_005fselect_0026_005fvalue_005fid.reuse(_jspx_th_sst_005fselect_005f9);
      _jspx_th_sst_005fselect_005f9_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sst_005fselect_005f9, _jsp_annotationprocessor, _jspx_th_sst_005fselect_005f9_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fsecondOptions_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_005fselect_005f9, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:secondOptions
    org.apache.jsp.tag.web.secondOptions_tag _jspx_th_tag_005fsecondOptions_005f1 = new org.apache.jsp.tag.web.secondOptions_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fsecondOptions_005f1);
    _jspx_th_tag_005fsecondOptions_005f1.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fsecondOptions_005f1.setParent(_jspx_th_sst_005fselect_005f9);
    // /WEB-INF/tags/dateRange.tag(45,54) name = sst type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fsecondOptions_005f1.setSst(new Boolean(true));
    _jspx_th_tag_005fsecondOptions_005f1.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fsecondOptions_005f1);
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
      _jspx_th_fmt_005fmessage_005f3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/dateRange.tag(47,25) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f3.setKey("common.latest");
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
