package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.serotonin.mango.Common;

public final class users_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(8);
    _jspx_dependants.add("/WEB-INF/jsp/include/tech.jsp");
    _jspx_dependants.add("/WEB-INF/tld/mango.tld");
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tags/page.tag");
    _jspx_dependants.add("/WEB-INF/tags/menuItem.tag");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
    _jspx_dependants.add("/WEB-INF/tags/help.tag");
    _jspx_dependants.add("/WEB-INF/tags/alarmLevelOptions.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsst_005fi18n_0026_005fkey_005fescapeDQuotes_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsst_005fi18n_0026_005fkey_005fescapeDQuotes_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fsst_005fi18n_0026_005fkey_005fescapeDQuotes_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      //  tag:page
      org.apache.jsp.tag.web.page_tag _jspx_th_tag_005fpage_005f0 = new org.apache.jsp.tag.web.page_tag();
      org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fpage_005f0);
      _jspx_th_tag_005fpage_005f0.setJspContext(_jspx_page_context);
      // /WEB-INF/jsp/users.jsp(22,0) name = dwr type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_tag_005fpage_005f0.setDwr("UsersDwr");
      // /WEB-INF/jsp/users.jsp(22,0) name = onload type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_tag_005fpage_005f0.setOnload("init");
      _jspx_th_tag_005fpage_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_tag_005fpage_005f0, null));
      _jspx_th_tag_005fpage_005f0.doTag();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fpage_005f0);
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_fmt_005fmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f0_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/users.jsp(63,80) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f0.setKey("common.access.none");
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

  private boolean _jspx_meth_fmt_005fmessage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f1_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f1.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/users.jsp(65,80) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f1.setKey("common.access.read");
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

  private boolean _jspx_meth_fmt_005fmessage_005f2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f2_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f2.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/users.jsp(68,84) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f2.setKey("common.access.set");
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

  private boolean _jspx_meth_fmt_005fmessage_005f3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f3 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f3_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f3.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/users.jsp(167,28) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f3.setKey("users.dataSaved");
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

  private boolean _jspx_meth_fmt_005fmessage_005f4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f4 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f4_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f4.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f4.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/users.jsp(174,32) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f4.setKey("users.added");
      int _jspx_eval_fmt_005fmessage_005f4 = _jspx_th_fmt_005fmessage_005f4.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f4);
      _jspx_th_fmt_005fmessage_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f4, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f4_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f5 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f5_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f5.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f5.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/users.jsp(177,32) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f5.setKey("users.saved");
      int _jspx_eval_fmt_005fmessage_005f5 = _jspx_th_fmt_005fmessage_005f5.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f5);
      _jspx_th_fmt_005fmessage_005f5_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f5, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f5_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sst_005fi18n_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:i18n
    com.serotonin.web.taglib.LocalizableMessageTag _jspx_th_sst_005fi18n_005f0 = (com.serotonin.web.taglib.LocalizableMessageTag) _005fjspx_005ftagPool_005fsst_005fi18n_0026_005fkey_005fescapeDQuotes_005fnobody.get(com.serotonin.web.taglib.LocalizableMessageTag.class);
    boolean _jspx_th_sst_005fi18n_005f0_reused = false;
    try {
      _jspx_th_sst_005fi18n_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sst_005fi18n_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/users.jsp(228,21) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fi18n_005f0.setKey("users.deleteConfirm");
      // /WEB-INF/jsp/users.jsp(228,21) name = escapeDQuotes type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fi18n_005f0.setEscapeDQuotes(true);
      int _jspx_eval_sst_005fi18n_005f0 = _jspx_th_sst_005fi18n_005f0.doStartTag();
      if (_jspx_th_sst_005fi18n_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fsst_005fi18n_0026_005fkey_005fescapeDQuotes_005fnobody.reuse(_jspx_th_sst_005fi18n_005f0);
      _jspx_th_sst_005fi18n_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sst_005fi18n_005f0, _jsp_annotationprocessor, _jspx_th_sst_005fi18n_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f6 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f6_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f6.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f6.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/users.jsp(254,41) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f6.setKey("users.title");
      int _jspx_eval_fmt_005fmessage_005f6 = _jspx_th_fmt_005fmessage_005f6.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f6);
      _jspx_th_fmt_005fmessage_005f6_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f6, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f6_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fhelp_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:help
    org.apache.jsp.tag.web.help_tag _jspx_th_tag_005fhelp_005f0 = new org.apache.jsp.tag.web.help_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fhelp_005f0);
    _jspx_th_tag_005fhelp_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fhelp_005f0.setParent(_jspx_parent);
    // /WEB-INF/jsp/users.jsp(255,16) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fhelp_005f0.setId("userAdministration");
    _jspx_th_tag_005fhelp_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fhelp_005f0);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f0 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f0);
    _jspx_th_tag_005fimg_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f0.setParent(_jspx_parent);
    // /WEB-INF/jsp/users.jsp(257,32) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f0.setPng("user_add");
    // /WEB-INF/jsp/users.jsp(257,32) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f0.setOnclick((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("showUser(${applicationScope['constants.Common.NEW_ID']})", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/users.jsp(257,32) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f0.setTitle("users.add");
    // /WEB-INF/jsp/users.jsp(257,32) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f0.setId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("u${applicationScope['constants.Common.NEW_ID']}Img", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_tag_005fimg_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f0);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f1 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f1);
    _jspx_th_tag_005fimg_005f1.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f1.setParent(_jspx_parent);
    // /WEB-INF/jsp/users.jsp(263,18) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f1.setId("u_TEMPLATE_Img");
    // /WEB-INF/jsp/users.jsp(263,18) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f1.setPng("user_green");
    // /WEB-INF/jsp/users.jsp(263,18) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f1.setTitle("users.user");
    _jspx_th_tag_005fimg_005f1.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f1);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f2 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f2);
    _jspx_th_tag_005fimg_005f2.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f2.setParent(_jspx_parent);
    // /WEB-INF/jsp/users.jsp(275,41) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f2.setId("userImg");
    // /WEB-INF/jsp/users.jsp(275,41) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f2.setPng("user_green");
    // /WEB-INF/jsp/users.jsp(275,41) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f2.setTitle("users.user");
    _jspx_th_tag_005fimg_005f2.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f2);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f7 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f7_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f7.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f7.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/users.jsp(276,16) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f7.setKey("users.details");
      int _jspx_eval_fmt_005fmessage_005f7 = _jspx_th_fmt_005fmessage_005f7.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f7);
      _jspx_th_fmt_005fmessage_005f7_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f7, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f7_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f3 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f3);
    _jspx_th_tag_005fimg_005f3.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f3.setParent(_jspx_parent);
    // /WEB-INF/jsp/users.jsp(279,16) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f3.setPng("save");
    // /WEB-INF/jsp/users.jsp(279,16) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f3.setOnclick("saveUser();");
    // /WEB-INF/jsp/users.jsp(279,16) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f3.setTitle("common.save");
    _jspx_th_tag_005fimg_005f3.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f3);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f4 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f4);
    _jspx_th_tag_005fimg_005f4.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f4.setParent(_jspx_parent);
    // /WEB-INF/jsp/users.jsp(280,16) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f4.setId("deleteImg");
    // /WEB-INF/jsp/users.jsp(280,16) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f4.setPng("delete");
    // /WEB-INF/jsp/users.jsp(280,16) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f4.setOnclick("deleteUser();");
    // /WEB-INF/jsp/users.jsp(280,16) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f4.setTitle("common.delete");
    // /WEB-INF/jsp/users.jsp(280,16) name = style type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f4.setStyle("display:none;");
    _jspx_th_tag_005fimg_005f4.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f4);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f5 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f5);
    _jspx_th_tag_005fimg_005f5.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f5.setParent(_jspx_parent);
    // /WEB-INF/jsp/users.jsp(281,16) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f5.setId("sendTestEmailImg");
    // /WEB-INF/jsp/users.jsp(281,16) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f5.setPng("email_go");
    // /WEB-INF/jsp/users.jsp(281,16) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f5.setOnclick("sendTestEmail();");
    // /WEB-INF/jsp/users.jsp(281,16) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f5.setTitle("common.sendTestEmail");
    // /WEB-INF/jsp/users.jsp(281,16) name = style type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f5.setStyle("display:none;");
    _jspx_th_tag_005fimg_005f5.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f5);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f8(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f8 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f8_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f8.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f8.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/users.jsp(294,44) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f8.setKey("users.username");
      int _jspx_eval_fmt_005fmessage_005f8 = _jspx_th_fmt_005fmessage_005f8.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f8);
      _jspx_th_fmt_005fmessage_005f8_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f8, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f8_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f9(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f9 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f9_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f9.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f9.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/users.jsp(298,44) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f9.setKey("users.newPassword");
      int _jspx_eval_fmt_005fmessage_005f9 = _jspx_th_fmt_005fmessage_005f9.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f9);
      _jspx_th_fmt_005fmessage_005f9_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f9, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f9_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f10(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f10 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f10_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f10.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f10.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/users.jsp(302,44) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f10.setKey("users.email");
      int _jspx_eval_fmt_005fmessage_005f10 = _jspx_th_fmt_005fmessage_005f10.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f10);
      _jspx_th_fmt_005fmessage_005f10_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f10, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f10_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f11(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f11 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f11_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f11.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f11.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/users.jsp(306,36) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f11.setKey("users.phone");
      int _jspx_eval_fmt_005fmessage_005f11 = _jspx_th_fmt_005fmessage_005f11.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f11);
      _jspx_th_fmt_005fmessage_005f11_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f11, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f11_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f12(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f12 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f12_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f12.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f12.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/users.jsp(310,44) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f12.setKey("common.administrator");
      int _jspx_eval_fmt_005fmessage_005f12 = _jspx_th_fmt_005fmessage_005f12.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f12);
      _jspx_th_fmt_005fmessage_005f12_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f12, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f12_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f13(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f13 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f13_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f13.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f13.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/users.jsp(314,44) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f13.setKey("common.disabled");
      int _jspx_eval_fmt_005fmessage_005f13 = _jspx_th_fmt_005fmessage_005f13.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f13);
      _jspx_th_fmt_005fmessage_005f13_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f13, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f13_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f14(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f14 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f14_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f14.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f14.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/users.jsp(318,44) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f14.setKey("users.receiveAlarmEmails");
      int _jspx_eval_fmt_005fmessage_005f14 = _jspx_th_fmt_005fmessage_005f14.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f14);
      _jspx_th_fmt_005fmessage_005f14_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f14, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f14_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005falarmLevelOptions_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:alarmLevelOptions
    org.apache.jsp.tag.web.alarmLevelOptions_tag _jspx_th_tag_005falarmLevelOptions_005f0 = new org.apache.jsp.tag.web.alarmLevelOptions_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005falarmLevelOptions_005f0);
    _jspx_th_tag_005falarmLevelOptions_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tag_005falarmLevelOptions_005f0.setParent(_jspx_parent);
    _jspx_th_tag_005falarmLevelOptions_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005falarmLevelOptions_005f0);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f15(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f15 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f15_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f15.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f15.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/users.jsp(322,44) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f15.setKey("users.receiveOwnAuditEvents");
      int _jspx_eval_fmt_005fmessage_005f15 = _jspx_th_fmt_005fmessage_005f15.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f15);
      _jspx_th_fmt_005fmessage_005f15_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f15, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f15_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f16(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f16 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f16_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f16.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f16.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/users.jsp(328,46) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f16.setKey("users.dataSources");
      int _jspx_eval_fmt_005fmessage_005f16 = _jspx_th_fmt_005fmessage_005f16.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f16);
      _jspx_th_fmt_005fmessage_005f16_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f16, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f16_reused);
    }
    return false;
  }

  private class Helper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public Helper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public void invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("    var userId = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionUser.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("    var editingUserId;\r\n");
      out.write("    var dataSources;\r\n");
      out.write("    var adminUser;\r\n");
      out.write("    \r\n");
      out.write("    function init() {\r\n");
      out.write("        UsersDwr.getInitData(function(data) {\r\n");
      out.write("            if (data.admin) {\r\n");
      out.write("                adminUser = true;\r\n");
      out.write("            \r\n");
      out.write("                show(\"userList\");\r\n");
      out.write("                show(\"usernameRow\");\r\n");
      out.write("                show(\"administrationRow\");\r\n");
      out.write("                show(\"disabledRow\");\r\n");
      out.write("                show(\"dataSources\");\r\n");
      out.write("                show(\"deleteImg\");\r\n");
      out.write("                show(\"sendTestEmailImg\");\r\n");
      out.write("                \r\n");
      out.write("                var i, j;\r\n");
      out.write("                for (i=0; i<data.users.length; i++) {\r\n");
      out.write("                    appendUser(data.users[i].id);\r\n");
      out.write("                    updateUser(data.users[i]);\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                var dshtml = \"\", id, dp;\r\n");
      out.write("                dataSources = data.dataSources;\r\n");
      out.write("                for (i=0; i<dataSources.length; i++) {\r\n");
      out.write("                    id = \"ds\"+ dataSources[i].id;\r\n");
      out.write("                    dshtml += '<input type=\"checkbox\" id=\"'+ id +'\" onclick=\"dataSourceChange(this)\">';\r\n");
      out.write("                    dshtml += '<label for=\"'+ id +'\"> '+ dataSources[i].name +'</label><br/>';\r\n");
      out.write("                    dshtml += '<div style=\"margin-left:25px;\" id=\"dsps'+ dataSources[i].id +'\">';\r\n");
      out.write("                    if (dataSources[i].points.length > 0) {\r\n");
      out.write("                        dshtml +=   '<table cellspacing=\"0\" cellpadding=\"1\">';\r\n");
      out.write("                        for (j=0; j<dataSources[i].points.length; j++) {\r\n");
      out.write("                            dp = dataSources[i].points[j];\r\n");
      out.write("                            dshtml += '<tr>';\r\n");
      out.write("                            dshtml +=   '<td class=\"formLabelRequired\">'+ dp.name +'</td>';\r\n");
      out.write("                            dshtml +=   '<td>';\r\n");
      out.write("                            dshtml +=     '<input type=\"radio\" name=\"dp'+ dp.id +'\" id=\"dp'+ dp.id +'/0\" value=\"0\">';\r\n");
      out.write("                            dshtml +=             '<label for=\"dp'+ dp.id +'/0\">");
      if (_jspx_meth_fmt_005fmessage_005f0(_jspx_parent, _jspx_page_context))
        return;
      out.write("</label> ';\r\n");
      out.write("                            dshtml +=     '<input type=\"radio\" name=\"dp'+ dp.id +'\" id=\"dp'+ dp.id +'/1\" value=\"1\">';\r\n");
      out.write("                            dshtml +=             '<label for=\"dp'+ dp.id +'/1\">");
      if (_jspx_meth_fmt_005fmessage_005f1(_jspx_parent, _jspx_page_context))
        return;
      out.write("</label> ';\r\n");
      out.write("                            if (dp.settable) {\r\n");
      out.write("                                dshtml +=     '<input type=\"radio\" name=\"dp'+ dp.id +'\" id=\"dp'+ dp.id +'/2\" value=\"2\">';\r\n");
      out.write("                                dshtml +=             '<label for=\"dp'+ dp.id +'/2\">");
      if (_jspx_meth_fmt_005fmessage_005f2(_jspx_parent, _jspx_page_context))
        return;
      out.write("</label>';\r\n");
      out.write("                            }\r\n");
      out.write("                            dshtml +=   '</td>';\r\n");
      out.write("                            dshtml += '</tr>';\r\n");
      out.write("                        }\r\n");
      out.write("                        dshtml +=   '</table>';\r\n");
      out.write("                    }\r\n");
      out.write("                    dshtml += '</div>';\r\n");
      out.write("                }\r\n");
      out.write("                $(\"dataSourceList\").innerHTML = dshtml;\r\n");
      out.write("            }\r\n");
      out.write("            else {\r\n");
      out.write("                // Not an admin user.\r\n");
      out.write("                adminUser = false;\r\n");
      out.write("                editingUserId = data.user.id;\r\n");
      out.write("                showUserCB(data.user);\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function showUser(userId) {\r\n");
      out.write("        if (editingUserId)\r\n");
      out.write("            stopImageFader($(\"u\"+ editingUserId +\"Img\"));\r\n");
      out.write("        editingUserId = userId;\r\n");
      out.write("        UsersDwr.getUser(userId, showUserCB);\r\n");
      out.write("        startImageFader($(\"u\"+ editingUserId +\"Img\"));\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function showUserCB(user) {\r\n");
      out.write("        show($(\"userDetails\"));\r\n");
      out.write("        $set(\"username\", user.username);\r\n");
      out.write("        $set(\"password\", user.password);\r\n");
      out.write("        $set(\"email\", user.email);\r\n");
      out.write("        $set(\"phone\", user.phone);\r\n");
      out.write("        $set(\"administrator\", user.admin);\r\n");
      out.write("        $set(\"disabled\", user.disabled);\r\n");
      out.write("        $set(\"receiveAlarmEmails\", user.receiveAlarmEmails);\r\n");
      out.write("        $set(\"receiveOwnAuditEvents\", user.receiveOwnAuditEvents);\r\n");
      out.write("        \r\n");
      out.write("        if (adminUser) {\r\n");
      out.write("            // Turn off all data sources and set all data points to 'none'.\r\n");
      out.write("            var i, j, dscb, dp;\r\n");
      out.write("            for (i=0; i<dataSources.length; i++) {\r\n");
      out.write("                dscb = $(\"ds\"+ dataSources[i].id);\r\n");
      out.write("                dscb.checked = false;\r\n");
      out.write("                dataSourceChange(dscb);\r\n");
      out.write("                for (j=0; j<dataSources[i].points.length; j++)\r\n");
      out.write("                    $set(\"dp\"+ dataSources[i].points[j].id, \"0\");\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            // Turn on the data sources to which the user has permission.\r\n");
      out.write("            for (i=0; i<user.dataSourcePermissions.length; i++) {\r\n");
      out.write("                dscb = $(\"ds\"+ user.dataSourcePermissions[i]);\r\n");
      out.write("                dscb.checked = true;\r\n");
      out.write("                dataSourceChange(dscb);\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            // Update the data point permissions.\r\n");
      out.write("            for (i=0; i<user.dataPointPermissions.length; i++)\r\n");
      out.write("                $set(\"dp\"+ user.dataPointPermissions[i].dataPointId, user.dataPointPermissions[i].permission);\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        setUserMessage();\r\n");
      out.write("        updateUserImg();\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function saveUser() {\r\n");
      out.write("        setUserMessage();\r\n");
      out.write("        if (adminUser) {\r\n");
      out.write("            // Create the list of allowed data sources and data point permissions.\r\n");
      out.write("            var i, j;\r\n");
      out.write("            var dsPermis = new Array();\r\n");
      out.write("            var dpPermis = new Array();\r\n");
      out.write("            var dpval;\r\n");
      out.write("            for (i=0; i<dataSources.length; i++) {\r\n");
      out.write("                if ($(\"ds\"+ dataSources[i].id).checked)\r\n");
      out.write("                    dsPermis[dsPermis.length] = dataSources[i].id;\r\n");
      out.write("                else {\r\n");
      out.write("                    for (j=0; j<dataSources[i].points.length; j++) {\r\n");
      out.write("                        dpval = $get(\"dp\"+ dataSources[i].points[j].id);\r\n");
      out.write("                        if (dpval == \"1\" || dpval == \"2\")\r\n");
      out.write("                            dpPermis[dpPermis.length] = {dataPointId: dataSources[i].points[j].id, permission: dpval};\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            UsersDwr.saveUserAdmin(editingUserId, $get(\"username\"), $get(\"password\"), $get(\"email\"), $get(\"phone\"), \r\n");
      out.write("                    $get(\"administrator\"), $get(\"disabled\"), $get(\"receiveAlarmEmails\"), $get(\"receiveOwnAuditEvents\"),\r\n");
      out.write("                    dsPermis, dpPermis, saveUserCB);\r\n");
      out.write("        }\r\n");
      out.write("        else\r\n");
      out.write("            UsersDwr.saveUser(editingUserId, $get(\"password\"), $get(\"email\"), $get(\"phone\"),\r\n");
      out.write("                    $get(\"receiveAlarmEmails\"), $get(\"receiveOwnAuditEvents\"), saveUserCB);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function saveUserCB(response) {\r\n");
      out.write("        if (response.hasMessages)\r\n");
      out.write("            showDwrMessages(response.messages, \"genericMessages\");\r\n");
      out.write("        else if (!adminUser)\r\n");
      out.write("            setUserMessage(\"");
      if (_jspx_meth_fmt_005fmessage_005f3(_jspx_parent, _jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("        else {\r\n");
      out.write("            if (editingUserId == ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      boolean _jspx_th_c_005fout_005f0_reused = false;
      try {
        _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fout_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
        // /WEB-INF/jsp/users.jsp(169,33) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fout_005f0.setValue( Common.NEW_ID );
        int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
        if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new SkipPageException();
        }
        _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
        _jspx_th_c_005fout_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f0, _jsp_annotationprocessor, _jspx_th_c_005fout_005f0_reused);
      }
      out.write(") {\r\n");
      out.write("                stopImageFader($(\"u\"+ editingUserId +\"Img\"));\r\n");
      out.write("                editingUserId = response.data.userId;\r\n");
      out.write("                appendUser(editingUserId);\r\n");
      out.write("                startImageFader($(\"u\"+ editingUserId +\"Img\"));\r\n");
      out.write("                setUserMessage(\"");
      if (_jspx_meth_fmt_005fmessage_005f4(_jspx_parent, _jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("            }\r\n");
      out.write("            else\r\n");
      out.write("                setUserMessage(\"");
      if (_jspx_meth_fmt_005fmessage_005f5(_jspx_parent, _jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("            UsersDwr.getUser(editingUserId, updateUser)\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function sendTestEmail() {\r\n");
      out.write("        UsersDwr.sendTestEmail($get(\"email\"), $get(\"username\"), function(result) {\r\n");
      out.write("            stopImageFader($(\"sendTestEmailImg\"));\r\n");
      out.write("            if (result.exception)\r\n");
      out.write("                setUserMessage(result.exception);\r\n");
      out.write("            else\r\n");
      out.write("                setUserMessage(result.message);\r\n");
      out.write("        });\r\n");
      out.write("        startImageFader($(\"sendTestEmailImg\"));\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function setUserMessage(message) {\r\n");
      out.write("        if (message)\r\n");
      out.write("            $set(\"userMessage\", message);\r\n");
      out.write("        else {\r\n");
      out.write("            $set(\"userMessage\");\r\n");
      out.write("            hideContextualMessages(\"userDetails\");\r\n");
      out.write("            hideGenericMessages(\"genericMessages\");\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function appendUser(userId) {\r\n");
      out.write("        createFromTemplate(\"u_TEMPLATE_\", userId, \"usersTable\");\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function updateUser(user) {\r\n");
      out.write("        $(\"u\"+ user.id +\"Username\").innerHTML = user.username;\r\n");
      out.write("        setUserImg(user.admin, user.disabled, $(\"u\"+ user.id +\"Img\"));\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function updateUserImg() {\r\n");
      out.write("        var admin = $get(\"administrator\");\r\n");
      out.write("        if (adminUser) {\r\n");
      out.write("            if (admin)\r\n");
      out.write("                hide(\"dataSources\");\r\n");
      out.write("            else\r\n");
      out.write("                show(\"dataSources\");\r\n");
      out.write("        }\r\n");
      out.write("        setUserImg(admin, $get(\"disabled\"), $(\"userImg\"));\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function dataSourceChange(dscb) {\r\n");
      out.write("        display(\"dsps\"+ dscb.id.substring(2), !dscb.checked);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function deleteUser() {\r\n");
      out.write("        if (confirm(\"");
      if (_jspx_meth_sst_005fi18n_005f0(_jspx_parent, _jspx_page_context))
        return;
      out.write("\")) {\r\n");
      out.write("        \tvar userId = editingUserId;\r\n");
      out.write("            startImageFader(\"deleteImg\");\r\n");
      out.write("            UsersDwr.deleteUser(userId, function(response) {\r\n");
      out.write("                stopImageFader(\"deleteImg\");\r\n");
      out.write("                \r\n");
      out.write("                if (response.hasMessages)\r\n");
      out.write("                \tsetUserMessage(response.messages[0].genericMessage);\r\n");
      out.write("                else {\r\n");
      out.write("                    stopImageFader(\"u\"+ userId +\"Img\");\r\n");
      out.write("                    $(\"usersTable\").removeChild($(\"u\"+ userId));\r\n");
      out.write("                    hide(\"userDetails\");\r\n");
      out.write("                    editingUserId = null;\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("  </script>\r\n");
      out.write("  \r\n");
      out.write("  <table>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td valign=\"top\" id=\"userList\" style=\"display:none;\">\r\n");
      out.write("        <div class=\"borderDiv\">\r\n");
      out.write("          <table width=\"100%\">\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>\r\n");
      out.write("                <span class=\"smallTitle\">");
      if (_jspx_meth_fmt_005fmessage_005f6(_jspx_parent, _jspx_page_context))
        return;
      out.write("</span>\r\n");
      out.write("                ");
      if (_jspx_meth_tag_005fhelp_005f0(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("              </td>\r\n");
      out.write("              <td align=\"right\">");
      if (_jspx_meth_tag_005fimg_005f0(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("          </table>\r\n");
      out.write("          <table id=\"usersTable\">\r\n");
      out.write("            <tbody id=\"u_TEMPLATE_\" onclick=\"showUser(getMangoId(this))\" class=\"ptr\" style=\"display:none;\"><tr>\r\n");
      out.write("              <td>");
      if (_jspx_meth_tag_005fimg_005f1(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("              <td class=\"link\" id=\"u_TEMPLATE_Username\"></td>\r\n");
      out.write("            </tr></tbody>\r\n");
      out.write("          </table>\r\n");
      out.write("        </div>\r\n");
      out.write("      </td>\r\n");
      out.write("      \r\n");
      out.write("      <td valign=\"top\" style=\"display:none;\" id=\"userDetails\">\r\n");
      out.write("        <div class=\"borderDiv\">\r\n");
      out.write("          <table width=\"100%\">\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>\r\n");
      out.write("                <span class=\"smallTitle\">");
      if (_jspx_meth_tag_005fimg_005f2(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                ");
      if (_jspx_meth_fmt_005fmessage_005f7(_jspx_parent, _jspx_page_context))
        return;
      out.write("</span>\r\n");
      out.write("              </td>\r\n");
      out.write("              <td align=\"right\">\r\n");
      out.write("                ");
      if (_jspx_meth_tag_005fimg_005f3(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                ");
      if (_jspx_meth_tag_005fimg_005f4(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                ");
      if (_jspx_meth_tag_005fimg_005f5(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("              </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("          </table>\r\n");
      out.write("          \r\n");
      out.write("          <table><tbody id=\"genericMessages\"></tbody></table>\r\n");
      out.write("          \r\n");
      out.write("          <table>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td colspan=\"2\" id=\"userMessage\" class=\"formError\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr id=\"usernameRow\" style=\"display:none;\">\r\n");
      out.write("              <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f8(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("              <td class=\"formField\"><input id=\"username\" type=\"text\"/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f9(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("              <td class=\"formField\"><input id=\"password\" type=\"text\"/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f10(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("              <td class=\"formField\"><input id=\"email\" type=\"text\" class=\"formLong\"/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td class=\"formLabel\">");
      if (_jspx_meth_fmt_005fmessage_005f11(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("              <td class=\"formField\"><input id=\"phone\" type=\"text\"/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr id=\"administrationRow\" style=\"display:none;\">\r\n");
      out.write("              <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f12(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("              <td class=\"formField\"><input id=\"administrator\" type=\"checkbox\" onclick=\"updateUserImg();\"/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr id=\"disabledRow\" style=\"display:none;\">\r\n");
      out.write("              <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f13(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("              <td class=\"formField\"><input id=\"disabled\" type=\"checkbox\" onclick=\"updateUserImg();\"/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f14(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("              <td class=\"formField\"><select id=\"receiveAlarmEmails\">");
      if (_jspx_meth_tag_005falarmLevelOptions_005f0(_jspx_parent, _jspx_page_context))
        return;
      out.write("</select></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f15(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("              <td class=\"formField\"><input id=\"receiveOwnAuditEvents\" type=\"checkbox\"/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tbody id=\"dataSources\" style=\"display:none;\">\r\n");
      out.write("              <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\r\n");
      out.write("              <tr id=\"dataSources\">\r\n");
      out.write("                <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f16(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("                <td class=\"formField\" id=\"dataSourceList\"></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </tbody>\r\n");
      out.write("          </table>\r\n");
      out.write("        </div>\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      return;
    }
    public void invoke( java.io.Writer writer )
      throws JspException
    {
      JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        this.jspContext.getELContext().putContext(JspContext.class,this.jspContext);
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
        }
      }
      catch( Throwable e ) {
        if (e instanceof SkipPageException)
            throw (SkipPageException) e;
        throw new JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
