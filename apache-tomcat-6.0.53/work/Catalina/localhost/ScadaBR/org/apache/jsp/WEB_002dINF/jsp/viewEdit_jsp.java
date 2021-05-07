package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.serotonin.mango.view.ShareUser;
import com.serotonin.mango.view.component.SimpleCompoundComponent;

public final class viewEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("mango:escapeScripts", com.serotonin.mango.web.taglib.Functions.class, "escapeScripts", new Class[] {java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(15);
    _jspx_dependants.add("/WEB-INF/jsp/include/tech.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/include/staticEditor.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/include/settingsEditor.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/include/graphicRendererEditor.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/include/compoundEditor.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/include/customEditor.jsp");
    _jspx_dependants.add("/WEB-INF/tld/mango.tld");
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tags/page.tag");
    _jspx_dependants.add("/WEB-INF/tags/menuItem.tag");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
    _jspx_dependants.add("/WEB-INF/tags/help.tag");
    _jspx_dependants.add("/WEB-INF/tags/sharedUsers.tag");
    _jspx_dependants.add("/WEB-INF/tags/timePeriodOptions.tag");
    _jspx_dependants.add("/WEB-INF/tags/alarmLevelOptions.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsst_005fconvert_0026_005fobj_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fbind_0026_005fpath;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsst_005fselect_0026_005fvalue_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsst_005foption_0026_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsst_005fconvert_0026_005fobj_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fspring_005fbind_0026_005fpath = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsst_005fselect_0026_005fvalue_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsst_005foption_0026_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.release();
    _005fjspx_005ftagPool_005fsst_005fconvert_0026_005fobj_005fnobody.release();
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fspring_005fbind_0026_005fpath.release();
    _005fjspx_005ftagPool_005fsst_005fselect_0026_005fvalue_005fname.release();
    _005fjspx_005ftagPool_005fsst_005foption_0026_005fvalue.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
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
      // /WEB-INF/jsp/viewEdit.jsp(22,0) name = dwr type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_tag_005fpage_005f0.setDwr("ViewDwr");
      // /WEB-INF/jsp/viewEdit.jsp(22,0) name = onload type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_tag_005fpage_005f0.setOnload("doOnload");
      // /WEB-INF/jsp/viewEdit.jsp(22,0) name = js type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_tag_005fpage_005f0.setJs("view");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/viewEdit.jsp(29,8) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.view.viewComponents}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
      // /WEB-INF/jsp/viewEdit.jsp(29,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("vc");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("          ");
            if (_jspx_meth_c_005fset_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("\r\n");
            out.write("          createViewComponent(");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mango:escapeScripts(compContent)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
            out.write(", false);\r\n");
            out.write("        ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new SkipPageException();
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_annotationprocessor, _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /WEB-INF/jsp/viewEdit.jsp(30,10) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("compContent");
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_eval_c_005fset_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_c_005fset_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          _jspx_push_body_count_c_005fforEach_005f0[0]++;
          out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_c_005fset_005f0);
        }
        do {
          if (_jspx_meth_sst_005fconvert_005f0(_jspx_th_c_005fset_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          int evalDoAfterBody = _jspx_th_c_005fset_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_c_005fset_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_c_005fforEach_005f0[0]--;
        }
      }
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_annotationprocessor, _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sst_005fconvert_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fset_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:convert
    com.serotonin.web.taglib.DwrConvertTag _jspx_th_sst_005fconvert_005f0 = (com.serotonin.web.taglib.DwrConvertTag) _005fjspx_005ftagPool_005fsst_005fconvert_0026_005fobj_005fnobody.get(com.serotonin.web.taglib.DwrConvertTag.class);
    boolean _jspx_th_sst_005fconvert_005f0_reused = false;
    try {
      _jspx_th_sst_005fconvert_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sst_005fconvert_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fset_005f0);
      // /WEB-INF/jsp/viewEdit.jsp(30,35) name = obj type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fconvert_005f0.setObj((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vc}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
      int _jspx_eval_sst_005fconvert_005f0 = _jspx_th_sst_005fconvert_005f0.doStartTag();
      if (_jspx_th_sst_005fconvert_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fsst_005fconvert_0026_005fobj_005fnobody.reuse(_jspx_th_sst_005fconvert_005f0);
      _jspx_th_sst_005fconvert_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sst_005fconvert_005f0, _jsp_annotationprocessor, _jspx_th_sst_005fconvert_005f0_reused);
    }
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
    // /WEB-INF/jsp/viewEdit.jsp(278,18) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f0.setPng("icon_view");
    // /WEB-INF/jsp/viewEdit.jsp(278,18) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f0.setTitle("viewEdit.editView");
    _jspx_th_tag_005fimg_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f0);
    return false;
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
      // /WEB-INF/jsp/viewEdit.jsp(279,43) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f0.setKey("viewEdit.viewProperties");
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

  private boolean _jspx_meth_tag_005fhelp_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:help
    org.apache.jsp.tag.web.help_tag _jspx_th_tag_005fhelp_005f0 = new org.apache.jsp.tag.web.help_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fhelp_005f0);
    _jspx_th_tag_005fhelp_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fhelp_005f0.setParent(_jspx_parent);
    // /WEB-INF/jsp/viewEdit.jsp(280,18) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fhelp_005f0.setId("editingGraphicalViews");
    _jspx_th_tag_005fhelp_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fhelp_005f0);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005fbind_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005fbind_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f1_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f1.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005fbind_005f0);
      // /WEB-INF/jsp/viewEdit.jsp(286,60) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f1.setKey("viewEdit.name");
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

  private boolean _jspx_meth_fmt_005fmessage_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005fbind_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005fbind_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f2_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f2.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005fbind_005f1);
      // /WEB-INF/jsp/viewEdit.jsp(295,60) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f2.setKey("common.xid");
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

  private boolean _jspx_meth_fmt_005fmessage_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005fbind_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005fbind_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f3 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f3_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f3.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005fbind_005f2);
      // /WEB-INF/jsp/viewEdit.jsp(304,48) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f3.setKey("viewEdit.background");
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
      // /WEB-INF/jsp/viewEdit.jsp(313,60) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f4.setKey("viewEdit.upload");
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
      // /WEB-INF/jsp/viewEdit.jsp(314,64) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f5.setKey("viewEdit.clearImage");
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

  private boolean _jspx_meth_fmt_005fmessage_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005fbind_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005fbind_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f6 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f6_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f6.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005fbind_005f3);
      // /WEB-INF/jsp/viewEdit.jsp(320,60) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f6.setKey("viewEdit.anonymous");
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

  private boolean _jspx_meth_fmt_005fmessage_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_005foption_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005fbind_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f7 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f7_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f7.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_005foption_005f0);
      // /WEB-INF/jsp/viewEdit.jsp(323,89) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f7.setKey("common.access.none");
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

  private boolean _jspx_meth_fmt_005fmessage_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_005foption_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005fbind_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f8 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f8_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f8.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_005foption_005f1);
      // /WEB-INF/jsp/viewEdit.jsp(324,89) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f8.setKey("common.access.read");
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

  private boolean _jspx_meth_fmt_005fmessage_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_005foption_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005fbind_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f9 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f9_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f9.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_005foption_005f2);
      // /WEB-INF/jsp/viewEdit.jsp(325,88) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f9.setKey("common.access.set");
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

  private boolean _jspx_meth_tag_005fsharedUsers_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:sharedUsers
    org.apache.jsp.tag.web.sharedUsers_tag _jspx_th_tag_005fsharedUsers_005f0 = new org.apache.jsp.tag.web.sharedUsers_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fsharedUsers_005f0);
    _jspx_th_tag_005fsharedUsers_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fsharedUsers_005f0.setParent(_jspx_parent);
    // /WEB-INF/jsp/viewEdit.jsp(337,12) name = doxId type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fsharedUsers_005f0.setDoxId("viewSharing");
    // /WEB-INF/jsp/viewEdit.jsp(337,12) name = noUsersKey type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fsharedUsers_005f0.setNoUsersKey("share.noViewUsers");
    _jspx_th_tag_005fsharedUsers_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fsharedUsers_005f0);
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
      // /WEB-INF/jsp/viewEdit.jsp(346,10) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f10.setKey("viewEdit.viewComponents");
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

  private boolean _jspx_meth_tag_005fimg_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f1 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f1);
    _jspx_th_tag_005fimg_005f1.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f1.setParent(_jspx_parent);
    // /WEB-INF/jsp/viewEdit.jsp(348,10) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f1.setPng("plugin_add");
    // /WEB-INF/jsp/viewEdit.jsp(348,10) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f1.setTitle("viewEdit.addViewComponent");
    // /WEB-INF/jsp/viewEdit.jsp(348,10) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f1.setOnclick("addViewComponent()");
    _jspx_th_tag_005fimg_005f1.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f1);
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
      // /WEB-INF/jsp/viewEdit.jsp(354,33) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f11.setKey("viewEdit.iconify");
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

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                    ");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("                    ");
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("                  ");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_annotationprocessor, _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/jsp/viewEdit.jsp(369,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty form.view.backgroundFilename}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                      <img id=\"viewBackground\" src=\"images/spacer.gif\" alt=\"\" width=\"740\" height=\"500\"\r\n");
          out.write("                              style=\"top:1px;left:1px;\"/>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_annotationprocessor, _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    boolean _jspx_th_c_005fotherwise_005f0_reused = false;
    try {
      _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
      if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                      <img id=\"viewBackground\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.view.backgroundFilename}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" alt=\"\"\r\n");
          out.write("                              style=\"top:1px;left:1px;\"/>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      _jspx_th_c_005fotherwise_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fotherwise_005f0, _jsp_annotationprocessor, _jspx_th_c_005fotherwise_005f0_reused);
    }
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
    // /WEB-INF/jsp/include/staticEditor.jsp(25,10) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f2.setPng("html");
    // /WEB-INF/jsp/include/staticEditor.jsp(25,10) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f2.setTitle("viewEdit.static.editor");
    // /WEB-INF/jsp/include/staticEditor.jsp(25,10) name = style type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f2.setStyle("display:inline;");
    _jspx_th_tag_005fimg_005f2.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f2);
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
    // /WEB-INF/jsp/include/staticEditor.jsp(28,10) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f3.setPng("save");
    // /WEB-INF/jsp/include/staticEditor.jsp(28,10) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f3.setOnclick("staticEditor.save()");
    // /WEB-INF/jsp/include/staticEditor.jsp(28,10) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f3.setTitle("common.save");
    // /WEB-INF/jsp/include/staticEditor.jsp(28,10) name = style type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f3.setStyle("display:inline;");
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
    // /WEB-INF/jsp/include/staticEditor.jsp(29,10) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f4.setPng("cross");
    // /WEB-INF/jsp/include/staticEditor.jsp(29,10) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f4.setOnclick("staticEditor.close()");
    // /WEB-INF/jsp/include/staticEditor.jsp(29,10) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f4.setTitle("common.close");
    // /WEB-INF/jsp/include/staticEditor.jsp(29,10) name = style type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f4.setStyle("display:inline;");
    _jspx_th_tag_005fimg_005f4.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f4);
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
      // /WEB-INF/jsp/include/staticEditor.jsp(40,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f12.setKey("viewEdit.graphic.text");
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
      // /WEB-INF/jsp/include/staticEditor.jsp(44,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f13.setKey("viewEdit.graphic.link");
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
      // /WEB-INF/jsp/include/staticEditor.jsp(48,38) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f14.setKey("viewEdit.graphic.views");
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
      // /WEB-INF/jsp/include/staticEditor.jsp(54,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f15.setKey("viewEdit.graphic.text");
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
      // /WEB-INF/jsp/include/staticEditor.jsp(58,39) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f16.setKey("eventHandlers.type.script");
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

  private boolean _jspx_meth_fmt_005fmessage_005f17(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f17 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f17_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f17.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f17.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/staticEditor.jsp(64,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f17.setKey("viewEdit.graphic.width");
      int _jspx_eval_fmt_005fmessage_005f17 = _jspx_th_fmt_005fmessage_005f17.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f17);
      _jspx_th_fmt_005fmessage_005f17_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f17, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f17_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f18(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f18 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f18_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f18.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f18.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/staticEditor.jsp(68,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f18.setKey("viewEdit.graphic.height");
      int _jspx_eval_fmt_005fmessage_005f18 = _jspx_th_fmt_005fmessage_005f18.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f18);
      _jspx_th_fmt_005fmessage_005f18_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f18, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f18_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f19(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f19 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f19_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f19.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f19.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/staticEditor.jsp(72,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f19.setKey("viewEdit.graphic.projectDefined");
      int _jspx_eval_fmt_005fmessage_005f19 = _jspx_th_fmt_005fmessage_005f19.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f19);
      _jspx_th_fmt_005fmessage_005f19_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f19, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f19_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f20(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f20 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f20_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f20.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f20.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/staticEditor.jsp(76,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f20.setKey("viewEdit.graphic.projectsSource");
      int _jspx_eval_fmt_005fmessage_005f20 = _jspx_th_fmt_005fmessage_005f20.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f20);
      _jspx_th_fmt_005fmessage_005f20_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f20, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f20_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f21(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f21 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f21_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f21.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f21.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/staticEditor.jsp(80,39) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f21.setKey("viewEdit.graphic.project");
      int _jspx_eval_fmt_005fmessage_005f21 = _jspx_th_fmt_005fmessage_005f21.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f21);
      _jspx_th_fmt_005fmessage_005f21_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f21, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f21_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f22(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f22 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f22_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f22.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f22.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/staticEditor.jsp(84,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f22.setKey("viewEdit.graphic.runtimeMode");
      int _jspx_eval_fmt_005fmessage_005f22 = _jspx_th_fmt_005fmessage_005f22.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f22);
      _jspx_th_fmt_005fmessage_005f22_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f22, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f22_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f23(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f23 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f23_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f23.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f23.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/staticEditor.jsp(90,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f23.setKey("graphic.chartWidth");
      int _jspx_eval_fmt_005fmessage_005f23 = _jspx_th_fmt_005fmessage_005f23.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f23);
      _jspx_th_fmt_005fmessage_005f23_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f23, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f23_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f24(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f24 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f24_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f24.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f24.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/staticEditor.jsp(94,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f24.setKey("graphic.chartHeight");
      int _jspx_eval_fmt_005fmessage_005f24 = _jspx_th_fmt_005fmessage_005f24.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f24);
      _jspx_th_fmt_005fmessage_005f24_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f24, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f24_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f25(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f25 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f25_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f25.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f25.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/staticEditor.jsp(222,170) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f25.setKey("viewEdit.graphic.saveToLoad");
      int _jspx_eval_fmt_005fmessage_005f25 = _jspx_th_fmt_005fmessage_005f25.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f25);
      _jspx_th_fmt_005fmessage_005f25_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f25, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f25_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f26(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f26 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f26_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f26.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f26.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/staticEditor.jsp(241,183) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f26.setKey("viewEdit.graphic.saveToLoad");
      int _jspx_eval_fmt_005fmessage_005f26 = _jspx_th_fmt_005fmessage_005f26.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f26);
      _jspx_th_fmt_005fmessage_005f26_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f26, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f26_reused);
    }
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
    // /WEB-INF/jsp/include/settingsEditor.jsp(25,10) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f5.setPng("plugin_edit");
    // /WEB-INF/jsp/include/settingsEditor.jsp(25,10) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f5.setTitle("viewEdit.settings.editor");
    // /WEB-INF/jsp/include/settingsEditor.jsp(25,10) name = style type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f5.setStyle("display:inline;");
    _jspx_th_tag_005fimg_005f5.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f5);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f6 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f6);
    _jspx_th_tag_005fimg_005f6.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f6.setParent(_jspx_parent);
    // /WEB-INF/jsp/include/settingsEditor.jsp(29,10) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f6.setPng("save");
    // /WEB-INF/jsp/include/settingsEditor.jsp(29,10) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f6.setOnclick("settingsEditor.save()");
    // /WEB-INF/jsp/include/settingsEditor.jsp(29,10) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f6.setTitle("common.save");
    // /WEB-INF/jsp/include/settingsEditor.jsp(29,10) name = style type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f6.setStyle("display:inline;");
    _jspx_th_tag_005fimg_005f6.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f6);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f7 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f7);
    _jspx_th_tag_005fimg_005f7.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f7.setParent(_jspx_parent);
    // /WEB-INF/jsp/include/settingsEditor.jsp(30,10) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f7.setPng("cross");
    // /WEB-INF/jsp/include/settingsEditor.jsp(30,10) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f7.setOnclick("settingsEditor.close()");
    // /WEB-INF/jsp/include/settingsEditor.jsp(30,10) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f7.setTitle("common.close");
    // /WEB-INF/jsp/include/settingsEditor.jsp(30,10) name = style type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f7.setStyle("display:inline;");
    _jspx_th_tag_005fimg_005f7.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f7);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f27(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f27 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f27_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f27.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f27.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/settingsEditor.jsp(36,38) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f27.setKey("viewEdit.settings.point");
      int _jspx_eval_fmt_005fmessage_005f27 = _jspx_th_fmt_005fmessage_005f27.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f27);
      _jspx_th_fmt_005fmessage_005f27_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f27, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f27_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f28(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f28 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f28_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f28.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f28.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/settingsEditor.jsp(40,30) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f28.setKey("viewEdit.settings.nameOverride");
      int _jspx_eval_fmt_005fmessage_005f28 = _jspx_th_fmt_005fmessage_005f28.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f28);
      _jspx_th_fmt_005fmessage_005f28_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f28, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f28_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f29(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f29 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f29_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f29.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f29.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/settingsEditor.jsp(44,30) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f29.setKey("viewEdit.settings.settableOverride");
      int _jspx_eval_fmt_005fmessage_005f29 = _jspx_th_fmt_005fmessage_005f29.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f29);
      _jspx_th_fmt_005fmessage_005f29_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f29, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f29_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f30(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f30 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f30_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f30.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f30.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/settingsEditor.jsp(48,30) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f30.setKey("viewEdit.settings.background");
      int _jspx_eval_fmt_005fmessage_005f30 = _jspx_th_fmt_005fmessage_005f30.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f30);
      _jspx_th_fmt_005fmessage_005f30_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f30, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f30_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f31(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f31 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f31_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f31.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f31.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/settingsEditor.jsp(52,30) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f31.setKey("viewEdit.settings.displayControls");
      int _jspx_eval_fmt_005fmessage_005f31 = _jspx_th_fmt_005fmessage_005f31.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f31);
      _jspx_th_fmt_005fmessage_005f31_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f31, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f31_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f8(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f8 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f8);
    _jspx_th_tag_005fimg_005f8.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f8.setParent(_jspx_parent);
    // /WEB-INF/jsp/include/graphicRendererEditor.jsp(25,10) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f8.setPng("graphic");
    // /WEB-INF/jsp/include/graphicRendererEditor.jsp(25,10) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f8.setTitle("viewEdit.graphic.editor");
    // /WEB-INF/jsp/include/graphicRendererEditor.jsp(25,10) name = style type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f8.setStyle("display:inline;");
    _jspx_th_tag_005fimg_005f8.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f8);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f9(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f9 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f9);
    _jspx_th_tag_005fimg_005f9.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f9.setParent(_jspx_parent);
    // /WEB-INF/jsp/include/graphicRendererEditor.jsp(29,10) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f9.setPng("save");
    // /WEB-INF/jsp/include/graphicRendererEditor.jsp(29,10) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f9.setOnclick("graphicRendererEditor.save()");
    // /WEB-INF/jsp/include/graphicRendererEditor.jsp(29,10) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f9.setTitle("common.save");
    // /WEB-INF/jsp/include/graphicRendererEditor.jsp(29,10) name = style type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f9.setStyle("display:inline;");
    _jspx_th_tag_005fimg_005f9.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f9);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f10(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f10 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f10);
    _jspx_th_tag_005fimg_005f10.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f10.setParent(_jspx_parent);
    // /WEB-INF/jsp/include/graphicRendererEditor.jsp(30,10) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f10.setPng("cross");
    // /WEB-INF/jsp/include/graphicRendererEditor.jsp(30,10) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f10.setOnclick("graphicRendererEditor.close()");
    // /WEB-INF/jsp/include/graphicRendererEditor.jsp(30,10) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f10.setTitle("common.close");
    // /WEB-INF/jsp/include/graphicRendererEditor.jsp(30,10) name = style type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f10.setStyle("display:inline;");
    _jspx_th_tag_005fimg_005f10.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f10);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f32(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f32 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f32_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f32.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f32.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(38,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f32.setKey("viewEdit.graphic.min");
      int _jspx_eval_fmt_005fmessage_005f32 = _jspx_th_fmt_005fmessage_005f32.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f32);
      _jspx_th_fmt_005fmessage_005f32_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f32, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f32_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f33(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f33 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f33_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f33.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f33.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(42,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f33.setKey("viewEdit.graphic.max");
      int _jspx_eval_fmt_005fmessage_005f33 = _jspx_th_fmt_005fmessage_005f33.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f33);
      _jspx_th_fmt_005fmessage_005f33_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f33, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f33_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f34(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f34 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f34_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f34.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f34.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(46,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f34.setKey("viewEdit.graphic.displayText");
      int _jspx_eval_fmt_005fmessage_005f34 = _jspx_th_fmt_005fmessage_005f34.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f34);
      _jspx_th_fmt_005fmessage_005f34_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f34, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f34_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f35(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f35 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f35_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f35.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f35.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(50,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f35.setKey("viewEdit.graphic.imageSet");
      int _jspx_eval_fmt_005fmessage_005f35 = _jspx_th_fmt_005fmessage_005f35.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f35);
      _jspx_th_fmt_005fmessage_005f35_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f35, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f35_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f1_reused = false;
    try {
      _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(54,14) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imageSets}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(54,14) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setVar("imageSet");
      int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
        if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                <option value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imageSet.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imageSet.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write(' ');
            out.write('(');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imageSet.imageCount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write(' ');
            if (_jspx_meth_fmt_005fmessage_005f36(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
              return true;
            out.write(")</option>\r\n");
            out.write("              ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new SkipPageException();
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
      _jspx_th_c_005fforEach_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f1, _jsp_annotationprocessor, _jspx_th_c_005fforEach_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f36(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f36 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f36_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f36.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(55,88) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f36.setKey("viewEdit.graphic.images");
      int _jspx_eval_fmt_005fmessage_005f36 = _jspx_th_fmt_005fmessage_005f36.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f36);
      _jspx_th_fmt_005fmessage_005f36_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f36, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f36_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f37(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f37 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f37_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f37.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f37.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(65,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f37.setKey("viewEdit.graphic.displayText");
      int _jspx_eval_fmt_005fmessage_005f37 = _jspx_th_fmt_005fmessage_005f37.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f37);
      _jspx_th_fmt_005fmessage_005f37_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f37, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f37_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f38(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f38 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f38_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f38.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f38.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(69,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f38.setKey("viewEdit.graphic.imageSet");
      int _jspx_eval_fmt_005fmessage_005f38 = _jspx_th_fmt_005fmessage_005f38.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f38);
      _jspx_th_fmt_005fmessage_005f38_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f38, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f38_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f2_reused = false;
    try {
      _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(73,14) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imageSets}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(73,14) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f2.setVar("imageSet");
      int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
        if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                <option value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imageSet.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imageSet.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write(' ');
            out.write('(');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imageSet.imageCount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write(' ');
            if (_jspx_meth_fmt_005fmessage_005f39(_jspx_th_c_005fforEach_005f2, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
              return true;
            out.write(")</option>\r\n");
            out.write("              ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new SkipPageException();
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f2.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
      _jspx_th_c_005fforEach_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f2, _jsp_annotationprocessor, _jspx_th_c_005fforEach_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f39(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f39 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f39_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f39.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f2);
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(74,88) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f39.setKey("viewEdit.graphic.images");
      int _jspx_eval_fmt_005fmessage_005f39 = _jspx_th_fmt_005fmessage_005f39.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f39);
      _jspx_th_fmt_005fmessage_005f39_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f39, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f39_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f40(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f40 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f40_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f40.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f40.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(80,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f40.setKey("viewEdit.graphic.zero");
      int _jspx_eval_fmt_005fmessage_005f40 = _jspx_th_fmt_005fmessage_005f40.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f40);
      _jspx_th_fmt_005fmessage_005f40_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f40, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f40_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f41(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f41 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f41_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f41.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f41.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(87,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f41.setKey("viewEdit.graphic.one");
      int _jspx_eval_fmt_005fmessage_005f41 = _jspx_th_fmt_005fmessage_005f41.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f41);
      _jspx_th_fmt_005fmessage_005f41_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f41, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f41_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f42(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f42 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f42_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f42.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f42.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(97,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f42.setKey("viewEdit.graphic.min");
      int _jspx_eval_fmt_005fmessage_005f42 = _jspx_th_fmt_005fmessage_005f42.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f42);
      _jspx_th_fmt_005fmessage_005f42_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f42, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f42_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f43(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f43 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f43_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f43.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f43.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(101,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f43.setKey("viewEdit.graphic.max");
      int _jspx_eval_fmt_005fmessage_005f43 = _jspx_th_fmt_005fmessage_005f43.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f43);
      _jspx_th_fmt_005fmessage_005f43_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f43, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f43_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f44(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f44 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f44_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f44.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f44.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(105,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f44.setKey("viewEdit.graphic.displayText");
      int _jspx_eval_fmt_005fmessage_005f44 = _jspx_th_fmt_005fmessage_005f44.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f44);
      _jspx_th_fmt_005fmessage_005f44_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f44, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f44_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f45(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f45 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f45_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f45.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f45.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(109,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f45.setKey("viewEdit.graphic.dynamicImage");
      int _jspx_eval_fmt_005fmessage_005f45 = _jspx_th_fmt_005fmessage_005f45.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f45);
      _jspx_th_fmt_005fmessage_005f45_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f45, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f45_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f3_reused = false;
    try {
      _jspx_th_c_005fforEach_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(113,14) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dynamicImages}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(113,14) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f3.setVar("dynamicImage");
      int[] _jspx_push_body_count_c_005fforEach_005f3 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f3 = _jspx_th_c_005fforEach_005f3.doStartTag();
        if (_jspx_eval_c_005fforEach_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                <option value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dynamicImage.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dynamicImage.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</option>\r\n");
            out.write("              ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f3.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new SkipPageException();
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f3[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f3.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f3.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f3);
      _jspx_th_c_005fforEach_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f3, _jsp_annotationprocessor, _jspx_th_c_005fforEach_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f46(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f46 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f46_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f46.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f46.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(124,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f46.setKey("viewEdit.graphic.displayText");
      int _jspx_eval_fmt_005fmessage_005f46 = _jspx_th_fmt_005fmessage_005f46.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f46);
      _jspx_th_fmt_005fmessage_005f46_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f46, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f46_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f47(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f47 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f47_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f47.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f47.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(128,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f47.setKey("viewEdit.graphic.imageSet");
      int _jspx_eval_fmt_005fmessage_005f47 = _jspx_th_fmt_005fmessage_005f47.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f47);
      _jspx_th_fmt_005fmessage_005f47_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f47, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f47_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f4_reused = false;
    try {
      _jspx_th_c_005fforEach_005f4.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f4.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(132,14) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imageSets}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(132,14) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f4.setVar("imageSet");
      int[] _jspx_push_body_count_c_005fforEach_005f4 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f4 = _jspx_th_c_005fforEach_005f4.doStartTag();
        if (_jspx_eval_c_005fforEach_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                <option value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imageSet.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imageSet.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write(' ');
            out.write('(');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imageSet.imageCount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write(' ');
            if (_jspx_meth_fmt_005fmessage_005f48(_jspx_th_c_005fforEach_005f4, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f4))
              return true;
            out.write(")</option>\r\n");
            out.write("              ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f4.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new SkipPageException();
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f4[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f4.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f4.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f4);
      _jspx_th_c_005fforEach_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f4, _jsp_annotationprocessor, _jspx_th_c_005fforEach_005f4_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f48(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f48 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f48_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f48.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f48.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f4);
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(133,88) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f48.setKey("viewEdit.graphic.images");
      int _jspx_eval_fmt_005fmessage_005f48 = _jspx_th_fmt_005fmessage_005f48.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f48);
      _jspx_th_fmt_005fmessage_005f48_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f48, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f48_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f49(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f49 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f49_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f49.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f49.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(139,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f49.setKey("viewEdit.graphic.state");
      int _jspx_eval_fmt_005fmessage_005f49 = _jspx_th_fmt_005fmessage_005f49.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f49);
      _jspx_th_fmt_005fmessage_005f49_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f49, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f49_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f50(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f50 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f50_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f50.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f50.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(148,44) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f50.setKey("viewEdit.graphic.script");
      int _jspx_eval_fmt_005fmessage_005f50 = _jspx_th_fmt_005fmessage_005f50.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f50);
      _jspx_th_fmt_005fmessage_005f50_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f50, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f50_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f51(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f51 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f51_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f51.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f51.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(155,42) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f51.setKey("viewEdit.graphic.noConfig");
      int _jspx_eval_fmt_005fmessage_005f51 = _jspx_th_fmt_005fmessage_005f51.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f51);
      _jspx_th_fmt_005fmessage_005f51_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f51, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f51_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f52(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f52 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f52_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f52.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f52.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(160,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f52.setKey("viewEdit.graphic.displayPointName");
      int _jspx_eval_fmt_005fmessage_005f52 = _jspx_th_fmt_005fmessage_005f52.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f52);
      _jspx_th_fmt_005fmessage_005f52_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f52, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f52_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f53(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f53 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f53_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f53.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f53.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(164,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f53.setKey("viewEdit.graphic.styleAttribute");
      int _jspx_eval_fmt_005fmessage_005f53 = _jspx_th_fmt_005fmessage_005f53.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f53);
      _jspx_th_fmt_005fmessage_005f53_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f53, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f53_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f54(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f54 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f54_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f54.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f54.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(171,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f54.setKey("viewEdit.graphic.scale");
      int _jspx_eval_fmt_005fmessage_005f54 = _jspx_th_fmt_005fmessage_005f54.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f54);
      _jspx_th_fmt_005fmessage_005f54_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f54, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f54_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f55(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f55 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f55_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f55.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f55.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(177,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f55.setKey("viewEdit.graphic.whenOnLabel");
      int _jspx_eval_fmt_005fmessage_005f55 = _jspx_th_fmt_005fmessage_005f55.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f55);
      _jspx_th_fmt_005fmessage_005f55_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f55, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f55_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f56(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f56 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f56_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f56.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f56.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(181,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f56.setKey("viewEdit.graphic.whenOffLabel");
      int _jspx_eval_fmt_005fmessage_005f56 = _jspx_th_fmt_005fmessage_005f56.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f56);
      _jspx_th_fmt_005fmessage_005f56_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f56, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f56_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f57(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f57 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f57_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f57.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f57.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(185,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f57.setKey("viewEdit.graphic.height");
      int _jspx_eval_fmt_005fmessage_005f57 = _jspx_th_fmt_005fmessage_005f57.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f57.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f57);
      _jspx_th_fmt_005fmessage_005f57_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f57, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f57_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f58(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f58 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f58_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f58.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f58.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(189,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f58.setKey("viewEdit.graphic.width");
      int _jspx_eval_fmt_005fmessage_005f58 = _jspx_th_fmt_005fmessage_005f58.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f58.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f58);
      _jspx_th_fmt_005fmessage_005f58_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f58, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f58_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sst_005fconvert_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:convert
    com.serotonin.web.taglib.DwrConvertTag _jspx_th_sst_005fconvert_005f1 = (com.serotonin.web.taglib.DwrConvertTag) _005fjspx_005ftagPool_005fsst_005fconvert_0026_005fobj_005fnobody.get(com.serotonin.web.taglib.DwrConvertTag.class);
    boolean _jspx_th_sst_005fconvert_005f1_reused = false;
    try {
      _jspx_th_sst_005fconvert_005f1.setPageContext(_jspx_page_context);
      _jspx_th_sst_005fconvert_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(209,25) name = obj type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fconvert_005f1.setObj((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imageSets}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
      int _jspx_eval_sst_005fconvert_005f1 = _jspx_th_sst_005fconvert_005f1.doStartTag();
      if (_jspx_th_sst_005fconvert_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fsst_005fconvert_0026_005fobj_005fnobody.reuse(_jspx_th_sst_005fconvert_005f1);
      _jspx_th_sst_005fconvert_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sst_005fconvert_005f1, _jsp_annotationprocessor, _jspx_th_sst_005fconvert_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sst_005fconvert_005f2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:convert
    com.serotonin.web.taglib.DwrConvertTag _jspx_th_sst_005fconvert_005f2 = (com.serotonin.web.taglib.DwrConvertTag) _005fjspx_005ftagPool_005fsst_005fconvert_0026_005fobj_005fnobody.get(com.serotonin.web.taglib.DwrConvertTag.class);
    boolean _jspx_th_sst_005fconvert_005f2_reused = false;
    try {
      _jspx_th_sst_005fconvert_005f2.setPageContext(_jspx_page_context);
      _jspx_th_sst_005fconvert_005f2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(210,29) name = obj type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fconvert_005f2.setObj((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dynamicImages}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
      int _jspx_eval_sst_005fconvert_005f2 = _jspx_th_sst_005fconvert_005f2.doStartTag();
      if (_jspx_th_sst_005fconvert_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fsst_005fconvert_0026_005fobj_005fnobody.reuse(_jspx_th_sst_005fconvert_005f2);
      _jspx_th_sst_005fconvert_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sst_005fconvert_005f2, _jsp_annotationprocessor, _jspx_th_sst_005fconvert_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f11(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f11 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f11);
    _jspx_th_tag_005fimg_005f11.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f11.setParent(_jspx_parent);
    // /WEB-INF/jsp/include/graphicRendererEditor.jsp(395,30) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f11.setPng("graphic");
    // /WEB-INF/jsp/include/graphicRendererEditor.jsp(395,30) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f11.setTitle("viewEdit.graphic.imageSample");
    // /WEB-INF/jsp/include/graphicRendererEditor.jsp(395,30) name = style type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f11.setStyle("display:inline;");
    _jspx_th_tag_005fimg_005f11.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f11);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f59(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f59 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f59_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f59.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f59.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(400,28) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f59.setKey("viewEdit.graphic.image");
      int _jspx_eval_fmt_005fmessage_005f59 = _jspx_th_fmt_005fmessage_005f59.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f59.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f59);
      _jspx_th_fmt_005fmessage_005f59_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f59, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f59_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f60(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f60 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f60_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f60.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f60.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(401,28) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f60.setKey("viewEdit.graphic.stateList");
      int _jspx_eval_fmt_005fmessage_005f60 = _jspx_th_fmt_005fmessage_005f60.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f60.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f60);
      _jspx_th_fmt_005fmessage_005f60_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f60, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f60_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f61(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f61 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f61_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f61.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f61.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/graphicRendererEditor.jsp(402,28) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f61.setKey("viewEdit.graphic.default");
      int _jspx_eval_fmt_005fmessage_005f61 = _jspx_th_fmt_005fmessage_005f61.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f61.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f61);
      _jspx_th_fmt_005fmessage_005f61_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f61, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f61_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f12(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f12 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f12);
    _jspx_th_tag_005fimg_005f12.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f12.setParent(_jspx_parent);
    // /WEB-INF/jsp/include/compoundEditor.jsp(26,10) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f12.setPng("plugin_edit");
    // /WEB-INF/jsp/include/compoundEditor.jsp(26,10) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f12.setTitle("viewEdit.compound.editor");
    // /WEB-INF/jsp/include/compoundEditor.jsp(26,10) name = style type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f12.setStyle("display:inline;");
    _jspx_th_tag_005fimg_005f12.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f12);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f13(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f13 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f13);
    _jspx_th_tag_005fimg_005f13.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f13.setParent(_jspx_parent);
    // /WEB-INF/jsp/include/compoundEditor.jsp(30,10) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f13.setPng("save");
    // /WEB-INF/jsp/include/compoundEditor.jsp(30,10) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f13.setOnclick("compoundEditor.save()");
    // /WEB-INF/jsp/include/compoundEditor.jsp(30,10) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f13.setTitle("common.save");
    // /WEB-INF/jsp/include/compoundEditor.jsp(30,10) name = style type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f13.setStyle("display:inline;");
    _jspx_th_tag_005fimg_005f13.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f13);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f14(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f14 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f14);
    _jspx_th_tag_005fimg_005f14.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f14.setParent(_jspx_parent);
    // /WEB-INF/jsp/include/compoundEditor.jsp(31,10) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f14.setPng("cross");
    // /WEB-INF/jsp/include/compoundEditor.jsp(31,10) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f14.setOnclick("compoundEditor.close()");
    // /WEB-INF/jsp/include/compoundEditor.jsp(31,10) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f14.setTitle("common.close");
    // /WEB-INF/jsp/include/compoundEditor.jsp(31,10) name = style type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f14.setStyle("display:inline;");
    _jspx_th_tag_005fimg_005f14.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f14);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f62(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f62 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f62_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f62.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f62.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/compoundEditor.jsp(37,38) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f62.setKey("viewEdit.compound.name");
      int _jspx_eval_fmt_005fmessage_005f62 = _jspx_th_fmt_005fmessage_005f62.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f62.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f62);
      _jspx_th_fmt_005fmessage_005f62_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f62, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f62_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f63(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f63 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f63_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f63.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f63.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/compoundEditor.jsp(42,32) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f63.setKey("viewEdit.compound.backgroundColour");
      int _jspx_eval_fmt_005fmessage_005f63 = _jspx_th_fmt_005fmessage_005f63.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f63.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f63);
      _jspx_th_fmt_005fmessage_005f63_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f63, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f63_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f64(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f64 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f64_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f64.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f64.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/compoundEditor.jsp(48,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f64.setKey("viewEdit.compound.width");
      int _jspx_eval_fmt_005fmessage_005f64 = _jspx_th_fmt_005fmessage_005f64.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f64.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f64);
      _jspx_th_fmt_005fmessage_005f64_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f64, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f64_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f65(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f65 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f65_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f65.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f65.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/compoundEditor.jsp(52,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f65.setKey("viewEdit.compound.height");
      int _jspx_eval_fmt_005fmessage_005f65 = _jspx_th_fmt_005fmessage_005f65.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f65.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f65);
      _jspx_th_fmt_005fmessage_005f65_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f65, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f65_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f66(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f66 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f66_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f66.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f66.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/compoundEditor.jsp(56,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f66.setKey("viewEdit.compound.duration");
      int _jspx_eval_fmt_005fmessage_005f66 = _jspx_th_fmt_005fmessage_005f66.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f66.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f66);
      _jspx_th_fmt_005fmessage_005f66_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f66, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f66_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005ftimePeriodOptions_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriodOptions
    org.apache.jsp.tag.web.timePeriodOptions_tag _jspx_th_tag_005ftimePeriodOptions_005f0 = new org.apache.jsp.tag.web.timePeriodOptions_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005ftimePeriodOptions_005f0);
    _jspx_th_tag_005ftimePeriodOptions_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tag_005ftimePeriodOptions_005f0.setParent(_jspx_parent);
    // /WEB-INF/jsp/include/compoundEditor.jsp(60,14) name = sst type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005ftimePeriodOptions_005f0.setSst(new Boolean(false));
    // /WEB-INF/jsp/include/compoundEditor.jsp(60,14) name = s type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005ftimePeriodOptions_005f0.setS(new Boolean(true));
    // /WEB-INF/jsp/include/compoundEditor.jsp(60,14) name = min type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005ftimePeriodOptions_005f0.setMin(new Boolean(true));
    // /WEB-INF/jsp/include/compoundEditor.jsp(60,14) name = h type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005ftimePeriodOptions_005f0.setH(new Boolean(true));
    // /WEB-INF/jsp/include/compoundEditor.jsp(60,14) name = d type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005ftimePeriodOptions_005f0.setD(new Boolean(true));
    // /WEB-INF/jsp/include/compoundEditor.jsp(60,14) name = w type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005ftimePeriodOptions_005f0.setW(new Boolean(true));
    // /WEB-INF/jsp/include/compoundEditor.jsp(60,14) name = mon type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005ftimePeriodOptions_005f0.setMon(new Boolean(true));
    // /WEB-INF/jsp/include/compoundEditor.jsp(60,14) name = y type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005ftimePeriodOptions_005f0.setY(new Boolean(true));
    _jspx_th_tag_005ftimePeriodOptions_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005ftimePeriodOptions_005f0);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f15(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f15 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f15);
    _jspx_th_tag_005fimg_005f15.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f15.setParent(_jspx_parent);
    // /WEB-INF/jsp/include/customEditor.jsp(25,10) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f15.setPng("graphic");
    // /WEB-INF/jsp/include/customEditor.jsp(25,10) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f15.setTitle("viewEdit.graphic.editor");
    // /WEB-INF/jsp/include/customEditor.jsp(25,10) name = style type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f15.setStyle("display:inline;");
    _jspx_th_tag_005fimg_005f15.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f15);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f16(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f16 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f16);
    _jspx_th_tag_005fimg_005f16.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f16.setParent(_jspx_parent);
    // /WEB-INF/jsp/include/customEditor.jsp(29,10) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f16.setPng("save");
    // /WEB-INF/jsp/include/customEditor.jsp(29,10) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f16.setOnclick("customEditor.save()");
    // /WEB-INF/jsp/include/customEditor.jsp(29,10) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f16.setTitle("common.save");
    // /WEB-INF/jsp/include/customEditor.jsp(29,10) name = style type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f16.setStyle("display:inline;");
    _jspx_th_tag_005fimg_005f16.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f16);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f17(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f17 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f17);
    _jspx_th_tag_005fimg_005f17.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f17.setParent(_jspx_parent);
    // /WEB-INF/jsp/include/customEditor.jsp(30,10) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f17.setPng("cross");
    // /WEB-INF/jsp/include/customEditor.jsp(30,10) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f17.setOnclick("customEditor.close()");
    // /WEB-INF/jsp/include/customEditor.jsp(30,10) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f17.setTitle("common.close");
    // /WEB-INF/jsp/include/customEditor.jsp(30,10) name = style type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f17.setStyle("display:inline;");
    _jspx_th_tag_005fimg_005f17.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f17);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f67(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f67 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f67_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f67.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f67.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/customEditor.jsp(38,32) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f67.setKey("common.alarmLevel");
      int _jspx_eval_fmt_005fmessage_005f67 = _jspx_th_fmt_005fmessage_005f67.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f67.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f67);
      _jspx_th_fmt_005fmessage_005f67_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f67, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f67_reused);
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
    // /WEB-INF/jsp/include/customEditor.jsp(39,80) name = allOption type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005falarmLevelOptions_005f0.setAllOption(new Boolean(true));
    _jspx_th_tag_005falarmLevelOptions_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005falarmLevelOptions_005f0);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f68(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f68 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f68_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f68.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f68.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/customEditor.jsp(42,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f68.setKey("viewEdit.graphic.maxListSize");
      int _jspx_eval_fmt_005fmessage_005f68 = _jspx_th_fmt_005fmessage_005f68.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f68.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f68);
      _jspx_th_fmt_005fmessage_005f68_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f68, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f68_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f69(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f69 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f69_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f69.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f69.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/customEditor.jsp(46,40) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f69.setKey("viewEdit.graphic.width");
      int _jspx_eval_fmt_005fmessage_005f69 = _jspx_th_fmt_005fmessage_005f69.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f69.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f69);
      _jspx_th_fmt_005fmessage_005f69_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f69, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f69_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f70(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f70 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f70_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f70.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f70.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/customEditor.jsp(50,32) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f70.setKey("viewEdit.graphic.hideIdColumn");
      int _jspx_eval_fmt_005fmessage_005f70 = _jspx_th_fmt_005fmessage_005f70.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f70.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f70);
      _jspx_th_fmt_005fmessage_005f70_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f70, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f70_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f71(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f71 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f71_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f71.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f71.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/customEditor.jsp(54,32) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f71.setKey("viewEdit.graphic.hideAlarmLevelColumn");
      int _jspx_eval_fmt_005fmessage_005f71 = _jspx_th_fmt_005fmessage_005f71.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f71.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f71);
      _jspx_th_fmt_005fmessage_005f71_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f71, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f71_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f72(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f72 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f72_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f72.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f72.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/customEditor.jsp(58,32) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f72.setKey("viewEdit.graphic.hideTimestampColumn");
      int _jspx_eval_fmt_005fmessage_005f72 = _jspx_th_fmt_005fmessage_005f72.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f72.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f72);
      _jspx_th_fmt_005fmessage_005f72_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f72, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f72_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f73(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f73 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f73_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f73.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f73.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/customEditor.jsp(62,32) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f73.setKey("viewEdit.graphic.hideInactivityColumn");
      int _jspx_eval_fmt_005fmessage_005f73 = _jspx_th_fmt_005fmessage_005f73.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f73.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f73);
      _jspx_th_fmt_005fmessage_005f73_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f73, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f73_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f74(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f74 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f74_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f74.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f74.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/include/customEditor.jsp(66,32) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f74.setKey("viewEdit.graphic.hideAckColumn");
      int _jspx_eval_fmt_005fmessage_005f74 = _jspx_th_fmt_005fmessage_005f74.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f74.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f74);
      _jspx_th_fmt_005fmessage_005f74_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f74, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f74_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f75(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f75 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f75_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f75.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f75.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/viewEdit.jsp(392,56) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f75.setKey("common.save");
      int _jspx_eval_fmt_005fmessage_005f75 = _jspx_th_fmt_005fmessage_005f75.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f75.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f75);
      _jspx_th_fmt_005fmessage_005f75_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f75, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f75_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f76(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f76 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f76_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f76.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f76.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/viewEdit.jsp(393,58) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f76.setKey("common.delete");
      int _jspx_eval_fmt_005fmessage_005f76 = _jspx_th_fmt_005fmessage_005f76.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f76.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f76);
      _jspx_th_fmt_005fmessage_005f76_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f76, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f76_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f77(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f77 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f77_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f77.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f77.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/viewEdit.jsp(394,58) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f77.setKey("common.cancel");
      int _jspx_eval_fmt_005fmessage_005f77 = _jspx_th_fmt_005fmessage_005f77.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f77.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f77);
      _jspx_th_fmt_005fmessage_005f77_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f77, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f77_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f18(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f18 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f18);
    _jspx_th_tag_005fimg_005f18.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f18.setParent(_jspx_parent);
    // /WEB-INF/jsp/viewEdit.jsp(411,22) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f18.setPng("hourglass");
    // /WEB-INF/jsp/viewEdit.jsp(411,22) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f18.setTitle("common.gettingData");
    _jspx_th_tag_005fimg_005f18.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f18);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f19(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f19 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f19);
    _jspx_th_tag_005fimg_005f19.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f19.setParent(_jspx_parent);
    // /WEB-INF/jsp/viewEdit.jsp(415,24) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f19.setPng("plugin_edit");
    // /WEB-INF/jsp/viewEdit.jsp(415,24) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f19.setOnclick("openSettingsEditor(getViewComponentId(this))");
    // /WEB-INF/jsp/viewEdit.jsp(415,24) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f19.setTitle("viewEdit.editPointView");
    _jspx_th_tag_005fimg_005f19.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f19);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f20(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f20 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f20);
    _jspx_th_tag_005fimg_005f20.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f20.setParent(_jspx_parent);
    // /WEB-INF/jsp/viewEdit.jsp(417,24) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f20.setPng("graphic");
    // /WEB-INF/jsp/viewEdit.jsp(417,24) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f20.setOnclick("openGraphicRendererEditor(getViewComponentId(this))");
    // /WEB-INF/jsp/viewEdit.jsp(417,24) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f20.setTitle("viewEdit.editGraphicalRenderer");
    _jspx_th_tag_005fimg_005f20.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f20);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f21(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f21 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f21);
    _jspx_th_tag_005fimg_005f21.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f21.setParent(_jspx_parent);
    // /WEB-INF/jsp/viewEdit.jsp(419,24) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f21.setPng("plugin_delete");
    // /WEB-INF/jsp/viewEdit.jsp(419,24) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f21.setOnclick("deleteViewComponent(getViewComponentId(this))");
    // /WEB-INF/jsp/viewEdit.jsp(419,24) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f21.setTitle("viewEdit.deletePointView");
    _jspx_th_tag_005fimg_005f21.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f21);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f22(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f22 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f22);
    _jspx_th_tag_005fimg_005f22.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f22.setParent(_jspx_parent);
    // /WEB-INF/jsp/viewEdit.jsp(427,16) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f22.setPng("warn");
    // /WEB-INF/jsp/viewEdit.jsp(427,16) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f22.setTitle("common.warning");
    _jspx_th_tag_005fimg_005f22.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f22);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f23(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f23 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f23);
    _jspx_th_tag_005fimg_005f23.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f23.setParent(_jspx_parent);
    // /WEB-INF/jsp/viewEdit.jsp(439,24) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f23.setPng("pencil");
    // /WEB-INF/jsp/viewEdit.jsp(439,24) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f23.setOnclick("openStaticEditor(getViewComponentId(this))");
    // /WEB-INF/jsp/viewEdit.jsp(439,24) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f23.setTitle("viewEdit.editStaticView");
    _jspx_th_tag_005fimg_005f23.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f23);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f24(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f24 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f24);
    _jspx_th_tag_005fimg_005f24.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f24.setParent(_jspx_parent);
    // /WEB-INF/jsp/viewEdit.jsp(441,24) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f24.setPng("html_delete");
    // /WEB-INF/jsp/viewEdit.jsp(441,24) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f24.setOnclick("deleteViewComponent(getViewComponentId(this))");
    // /WEB-INF/jsp/viewEdit.jsp(441,24) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f24.setTitle("viewEdit.deleteStaticView");
    _jspx_th_tag_005fimg_005f24.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f24);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f25(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f25 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f25);
    _jspx_th_tag_005fimg_005f25.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f25.setParent(_jspx_parent);
    // /WEB-INF/jsp/viewEdit.jsp(454,24) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f25.setPng("plugin_edit");
    // /WEB-INF/jsp/viewEdit.jsp(454,24) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f25.setOnclick("openCompoundEditor(getViewComponentId(this))");
    // /WEB-INF/jsp/viewEdit.jsp(454,24) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f25.setTitle("viewEdit.editPointView");
    _jspx_th_tag_005fimg_005f25.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f25);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f26(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f26 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f26);
    _jspx_th_tag_005fimg_005f26.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f26.setParent(_jspx_parent);
    // /WEB-INF/jsp/viewEdit.jsp(456,24) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f26.setPng("plugin_delete");
    // /WEB-INF/jsp/viewEdit.jsp(456,24) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f26.setOnclick("deleteViewComponent(getViewComponentId(this))");
    // /WEB-INF/jsp/viewEdit.jsp(456,24) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f26.setTitle("viewEdit.deletePointView");
    _jspx_th_tag_005fimg_005f26.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f26);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f27(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f27 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f27);
    _jspx_th_tag_005fimg_005f27.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f27.setParent(_jspx_parent);
    // /WEB-INF/jsp/viewEdit.jsp(473,22) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f27.setPng("hourglass");
    // /WEB-INF/jsp/viewEdit.jsp(473,22) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f27.setTitle("common.gettingData");
    _jspx_th_tag_005fimg_005f27.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f27);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f28(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f28 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f28);
    _jspx_th_tag_005fimg_005f28.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f28.setParent(_jspx_parent);
    // /WEB-INF/jsp/viewEdit.jsp(477,24) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f28.setPng("plugin_edit");
    // /WEB-INF/jsp/viewEdit.jsp(477,24) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f28.setOnclick("openCompoundEditor(getViewComponentId(this))");
    // /WEB-INF/jsp/viewEdit.jsp(477,24) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f28.setTitle("viewEdit.editPointView");
    _jspx_th_tag_005fimg_005f28.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f28);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f29(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f29 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f29);
    _jspx_th_tag_005fimg_005f29.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f29.setParent(_jspx_parent);
    // /WEB-INF/jsp/viewEdit.jsp(479,24) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f29.setPng("plugin_delete");
    // /WEB-INF/jsp/viewEdit.jsp(479,24) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f29.setOnclick("deleteViewComponent(getViewComponentId(this))");
    // /WEB-INF/jsp/viewEdit.jsp(479,24) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f29.setTitle("viewEdit.deletePointView");
    _jspx_th_tag_005fimg_005f29.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f29);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f30(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f30 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f30);
    _jspx_th_tag_005fimg_005f30.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f30.setParent(_jspx_parent);
    // /WEB-INF/jsp/viewEdit.jsp(497,24) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f30.setPng("pencil");
    // /WEB-INF/jsp/viewEdit.jsp(497,24) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f30.setOnclick("openCustomEditor(getViewComponentId(this))");
    // /WEB-INF/jsp/viewEdit.jsp(497,24) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f30.setTitle("viewEdit.editStaticView");
    _jspx_th_tag_005fimg_005f30.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f30);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f31(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f31 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f31);
    _jspx_th_tag_005fimg_005f31.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f31.setParent(_jspx_parent);
    // /WEB-INF/jsp/viewEdit.jsp(499,24) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f31.setPng("html_delete");
    // /WEB-INF/jsp/viewEdit.jsp(499,24) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f31.setOnclick("deleteViewComponent(getViewComponentId(this))");
    // /WEB-INF/jsp/viewEdit.jsp(499,24) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f31.setTitle("viewEdit.deleteStaticView");
    _jspx_th_tag_005fimg_005f31.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f31);
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
      out.write("  <script type=\"text/javascript\" src=\"resources/wz_jsgraphics.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("    mango.view.initEditView();\r\n");
      out.write("    mango.share.dwr = ViewDwr;\r\n");
      out.write("    \r\n");
      out.write("    function doOnload() {\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        ViewDwr.editInit(function(result) {\r\n");
      out.write("            mango.share.users = result.shareUsers;\r\n");
      out.write("            mango.share.writeSharedUsers(result.viewUsers);\r\n");
      out.write("            dwr.util.addOptions($(\"componentList\"), result.componentTypes, \"key\", \"value\");\r\n");
      out.write("            settingsEditor.setPointList(result.pointList);\r\n");
      out.write("            compoundEditor.setPointList(result.pointList);\r\n");
      out.write("            MiscDwr.notifyLongPoll(mango.longPoll.pollSessionId);\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function addViewComponent() {\r\n");
      out.write("        ViewDwr.addComponent($get(\"componentList\"), function(viewComponent) {\r\n");
      out.write("            createViewComponent(viewComponent, true);\r\n");
      out.write("            MiscDwr.notifyLongPoll(mango.longPoll.pollSessionId);\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function createViewComponent(viewComponent, center) {\r\n");
      out.write("        var content;\r\n");
      out.write("        \r\n");
      out.write("        if (viewComponent.pointComponent)\r\n");
      out.write("            content = $(\"pointTemplate\").cloneNode(true);\r\n");
      out.write("        else if (viewComponent.defName == 'imageChart')\r\n");
      out.write("            content = $(\"imageChartTemplate\").cloneNode(true);\r\n");
      out.write("        else if (viewComponent.compoundComponent)\r\n");
      out.write("            content = $(\"compoundTemplate\").cloneNode(true);\r\n");
      out.write("        else if(viewComponent.customComponent)\r\n");
      out.write("        \tcontent = $(\"customTemplate\").cloneNode(true);\r\n");
      out.write("        else\r\n");
      out.write("            content = $(\"htmlTemplate\").cloneNode(true);\r\n");
      out.write("        \r\n");
      out.write("        configureComponentContent(content, viewComponent, $(\"viewContent\"), center);\r\n");
      out.write("        \r\n");
      out.write("        if (viewComponent.defName == 'simpleCompound') {\r\n");
      out.write("            childContent = $(\"compoundChildTemplate\").cloneNode(true);\r\n");
      out.write("            configureComponentContent(childContent, viewComponent.leadComponent, $(\"c\"+ viewComponent.id +\"Content\"),\r\n");
      out.write("                    false);\r\n");
      out.write("        }\r\n");
      out.write("        else if (viewComponent.defName == 'imageChart')\r\n");
      out.write("            ;\r\n");
      out.write("        else if (viewComponent.compoundComponent) {\r\n");
      out.write("            // Compound components only have their static content set at page load.\r\n");
      out.write("            $set(content.id +\"Content\", viewComponent.staticContent);\r\n");
      out.write("            \r\n");
      out.write("            // Add the child components.\r\n");
      out.write("            var childContent;\r\n");
      out.write("            for (var i=0; i<viewComponent.childComponents.length; i++) {\r\n");
      out.write("                childContent = $(\"compoundChildTemplate\").cloneNode(true);\r\n");
      out.write("                configureComponentContent(childContent, viewComponent.childComponents[i].viewComponent,\r\n");
      out.write("                        $(\"c\"+ viewComponent.id +\"ChildComponents\"), false);\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        addDnD(content.id);\r\n");
      out.write("        \r\n");
      out.write("        if (center)\r\n");
      out.write("            updateViewComponentLocation(content.id);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function configureComponentContent(content, viewComponent, parent, center) {\r\n");
      out.write("        content.id = \"c\"+ viewComponent.id;\r\n");
      out.write("        content.viewComponentId = viewComponent.id;\r\n");
      out.write("        updateNodeIds(content, viewComponent.id);\r\n");
      out.write("        parent.appendChild(content);\r\n");
      out.write("        \r\n");
      out.write("        if (viewComponent.defName == \"html\" || viewComponent.defName == \"link\" \r\n");
      out.write("            || viewComponent.defName == \"scriptButton\" || viewComponent.defName == \"flexBuilder\"\r\n");
      out.write("            \t|| viewComponent.defName == \"chartComparator\" )\r\n");
      out.write("            // HTML components only get updated at page load and editing.\r\n");
      out.write("            updateHtmlComponentContent(content.id, viewComponent.content);\r\n");
      out.write("        \r\n");
      out.write("        show(content);\r\n");
      out.write("        \r\n");
      out.write("        if (center) {\r\n");
      out.write("            // Calculate the location for the new point. For now just put it in the center.\r\n");
      out.write("            var bkgd = $(\"viewBackground\");\r\n");
      out.write("            var bkgdBox = dojo.html.getMarginBox(bkgd);\r\n");
      out.write("            var compContentBox = dojo.html.getMarginBox(content);\r\n");
      out.write("            content.style.left = parseInt((bkgdBox.width - compContentBox.width) / 2) +\"px\";\r\n");
      out.write("            content.style.top = parseInt((bkgdBox.height - compContentBox.height) / 2) +\"px\";\r\n");
      out.write("        }\r\n");
      out.write("        else {\r\n");
      out.write("            content.style.left = viewComponent.x +\"px\";\r\n");
      out.write("            content.style.top = viewComponent.y +\"px\";\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function updateNodeIds(elem, id) {\r\n");
      out.write("        var i;\r\n");
      out.write("        for (i=0; i<elem.attributes.length; i++) {\r\n");
      out.write("            if (elem.attributes[i].value && elem.attributes[i].value.indexOf(\"_TEMPLATE_\") != -1)\r\n");
      out.write("                elem.attributes[i].value = elem.attributes[i].value.replace(/_TEMPLATE_/, id);\r\n");
      out.write("        }\r\n");
      out.write("        for (var i=0; i<elem.childNodes.length; i++) {\r\n");
      out.write("            if (elem.childNodes[i].attributes)\r\n");
      out.write("                updateNodeIds(elem.childNodes[i], id);\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function updateHtmlComponentContent(id, content) {\r\n");
      out.write("        if (!content || content == \"\")\r\n");
      out.write("            $set(id +\"Content\", '<img src=\"images/html.png\" alt=\"\"/>');\r\n");
      out.write("        else\r\n");
      out.write("            $set(id +\"Content\", content);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function openStaticEditor(viewComponentId) {\r\n");
      out.write("        closeEditors();\r\n");
      out.write("        staticEditor.open(viewComponentId);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function openSettingsEditor(cid) {\r\n");
      out.write("        closeEditors();\r\n");
      out.write("        settingsEditor.open(cid);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function openGraphicRendererEditor(cid) {\r\n");
      out.write("        closeEditors(); \r\n");
      out.write("        graphicRendererEditor.open(cid);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function openCompoundEditor(cid) {\r\n");
      out.write("        closeEditors();\r\n");
      out.write("        compoundEditor.open(cid);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function openCustomEditor(cid) {\r\n");
      out.write("        closeEditors();\r\n");
      out.write("        customEditor.open(cid);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function positionEditor(compId, editorId) {\r\n");
      out.write("        // Position and display the renderer editor.\r\n");
      out.write("        var pDim = getNodeBounds($(\"c\"+ compId));\r\n");
      out.write("        var editDiv = $(editorId);\r\n");
      out.write("        editDiv.style.left = (pDim.x + pDim.w + 20) +\"px\";\r\n");
      out.write("        editDiv.style.top = (pDim.y + 10) +\"px\";\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function closeEditors() {\r\n");
      out.write("        settingsEditor.close();\r\n");
      out.write("        graphicRendererEditor.close();\r\n");
      out.write("        staticEditor.close();\r\n");
      out.write("        compoundEditor.close();\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function updateViewComponentLocation(divId) {\r\n");
      out.write("        var div = $(divId);\r\n");
      out.write("        var lt = div.style.left;\r\n");
      out.write("        var tp = div.style.top;\r\n");
      out.write("        \r\n");
      out.write("        // Remove the 'px's from the positions.\r\n");
      out.write("        lt = lt.substring(0, lt.length-2);\r\n");
      out.write("        tp = tp.substring(0, tp.length-2);\r\n");
      out.write("        \r\n");
      out.write("        // Save the new location.\r\n");
      out.write("        ViewDwr.setViewComponentLocation(div.viewComponentId, lt, tp);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function addDnD(divId) {\r\n");
      out.write("        var div = $(divId)\r\n");
      out.write("        var dragSource = new dojo.dnd.HtmlDragMoveSource(div);\r\n");
      out.write("        dragSource.constrainTo($(\"viewBackground\"));\r\n");
      out.write("        \r\n");
      out.write("        // Save the drag source in the div in case it gets deleted. See below.\r\n");
      out.write("        div.dragSource = dragSource;\r\n");
      out.write("        // Also, create a function to call on drag end to update the point view's location.\r\n");
      out.write("        div.onDragEnd = function() {updateViewComponentLocation(divId)};\r\n");
      out.write("        \r\n");
      out.write("        dojo.event.connect(dragSource, \"onDragEnd\", div.onDragEnd);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function deleteViewComponent(viewComponentId) {\r\n");
      out.write("        closeEditors();\r\n");
      out.write("        ViewDwr.deleteViewComponent(viewComponentId);\r\n");
      out.write("        \r\n");
      out.write("        var div = $(\"c\"+ viewComponentId);\r\n");
      out.write("        \r\n");
      out.write("        // Unregister the drag source from the DnD manager.\r\n");
      out.write("        div.dragSource.unregister();\r\n");
      out.write("        // Disconnect the event handling for drag ends on this guy.\r\n");
      out.write("        $(\"viewContent\").removeChild(div);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function getViewComponentId(node) {\r\n");
      out.write("        while (!(node.viewComponentId))\r\n");
      out.write("            node = node.parentNode;\r\n");
      out.write("        return node.viewComponentId;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function iconizeClicked() {\r\n");
      out.write("        ViewDwr.getViewComponentIds(function(ids) {\r\n");
      out.write("            var i, comp, content;\r\n");
      out.write("            if ($get(\"iconifyCB\")) {\r\n");
      out.write("                mango.view.edit.iconize = true;\r\n");
      out.write("                for (i=0; i<ids.length; i++) {\r\n");
      out.write("                    comp = $(\"c\"+ ids[i]);\r\n");
      out.write("                    content = $(\"c\"+ ids[i] +\"Content\");\r\n");
      out.write("                    if (!comp.savedContent)\r\n");
      out.write("                        comp.savedContent = content.innerHTML;\r\n");
      out.write("                    content.innerHTML = \"<img src='images/plugin.png'/>\";\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            else {\r\n");
      out.write("                mango.view.edit.iconize = false;\r\n");
      out.write("                for (i=0; i<ids.length; i++) {\r\n");
      out.write("                    comp = $(\"c\"+ ids[i]);\r\n");
      out.write("                    content = $(\"c\"+ ids[i] +\"Content\");\r\n");
      out.write("                    if (comp.savedState)\r\n");
      out.write("                        mango.view.setContent(comp.savedState);                \r\n");
      out.write("                    else if (comp.savedContent)\r\n");
      out.write("                        content.innerHTML = comp.savedContent;\r\n");
      out.write("                    else\r\n");
      out.write("                        content.innerHTML = '';\r\n");
      out.write("                    comp.savedState = null;\r\n");
      out.write("                    comp.savedContent = null;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\tfunction resizeViewBackground(width, height) {\r\n");
      out.write("\t\tvar currentWidth = $(\"viewBackground\").width;\r\n");
      out.write("\t\tvar currentHeight = $(\"viewBackground\").height;\r\n");
      out.write("\r\n");
      out.write("\t\tif(width > currentWidth) {\r\n");
      out.write("\t\t\t$(\"viewBackground\").width = parseInt(width,10) + 30;\r\n");
      out.write("\t\t} \r\n");
      out.write("\t\tif(height > currentHeight) {\r\n");
      out.write("\t\t\t$(\"viewBackground\").height = parseInt(height,10) + 30;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("    \r\n");
      out.write("  </script>\r\n");
      out.write("  \r\n");
      out.write("  <form name=\"view\" action=\"\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("    <table>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td valign=\"top\">\r\n");
      out.write("          <div class=\"borderDiv marR\">\r\n");
      out.write("            <table>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td colspan=\"3\">\r\n");
      out.write("                  ");
      if (_jspx_meth_tag_005fimg_005f0(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                  <span class=\"smallTitle\">");
      if (_jspx_meth_fmt_005fmessage_005f0(_jspx_parent, _jspx_page_context))
        return;
      out.write("</span>\r\n");
      out.write("                  ");
      if (_jspx_meth_tag_005fhelp_005f0(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              \r\n");
      out.write("              ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_005fbind_005f0 = (org.springframework.web.servlet.tags.BindTag) _005fjspx_005ftagPool_005fspring_005fbind_0026_005fpath.get(org.springframework.web.servlet.tags.BindTag.class);
      boolean _jspx_th_spring_005fbind_005f0_reused = false;
      try {
        _jspx_th_spring_005fbind_005f0.setPageContext(_jspx_page_context);
        _jspx_th_spring_005fbind_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
        // /WEB-INF/jsp/viewEdit.jsp(284,14) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_spring_005fbind_005f0.setPath("form.view.name");
        int[] _jspx_push_body_count_spring_005fbind_005f0 = new int[] { 0 };
        try {
          int _jspx_eval_spring_005fbind_005f0 = _jspx_th_spring_005fbind_005f0.doStartTag();
          if (_jspx_eval_spring_005fbind_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                <tr>\r\n");
              out.write("                  <td class=\"formLabelRequired\" width=\"150\">");
              if (_jspx_meth_fmt_005fmessage_005f1(_jspx_th_spring_005fbind_005f0, _jspx_page_context, _jspx_push_body_count_spring_005fbind_005f0))
                return;
              out.write("</td>\r\n");
              out.write("                  <td class=\"formField\" width=\"250\">\r\n");
              out.write("                    <input type=\"text\" name=\"view.name\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\"/>\r\n");
              out.write("                  </td>\r\n");
              out.write("                  <td class=\"formError\">");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("</td>\r\n");
              out.write("                </tr>\r\n");
              out.write("              ");
              int evalDoAfterBody = _jspx_th_spring_005fbind_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_spring_005fbind_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            throw new SkipPageException();
          }
        } catch (Throwable _jspx_exception) {
          while (_jspx_push_body_count_spring_005fbind_005f0[0]-- > 0)
            out = _jspx_page_context.popBody();
          _jspx_th_spring_005fbind_005f0.doCatch(_jspx_exception);
        } finally {
          _jspx_th_spring_005fbind_005f0.doFinally();
        }
        _005fjspx_005ftagPool_005fspring_005fbind_0026_005fpath.reuse(_jspx_th_spring_005fbind_005f0);
        _jspx_th_spring_005fbind_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_spring_005fbind_005f0, _jsp_annotationprocessor, _jspx_th_spring_005fbind_005f0_reused);
      }
      out.write("\r\n");
      out.write("              ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_005fbind_005f1 = (org.springframework.web.servlet.tags.BindTag) _005fjspx_005ftagPool_005fspring_005fbind_0026_005fpath.get(org.springframework.web.servlet.tags.BindTag.class);
      boolean _jspx_th_spring_005fbind_005f1_reused = false;
      try {
        _jspx_th_spring_005fbind_005f1.setPageContext(_jspx_page_context);
        _jspx_th_spring_005fbind_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
        // /WEB-INF/jsp/viewEdit.jsp(293,14) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_spring_005fbind_005f1.setPath("form.view.xid");
        int[] _jspx_push_body_count_spring_005fbind_005f1 = new int[] { 0 };
        try {
          int _jspx_eval_spring_005fbind_005f1 = _jspx_th_spring_005fbind_005f1.doStartTag();
          if (_jspx_eval_spring_005fbind_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                <tr>\r\n");
              out.write("                  <td class=\"formLabelRequired\" width=\"150\">");
              if (_jspx_meth_fmt_005fmessage_005f2(_jspx_th_spring_005fbind_005f1, _jspx_page_context, _jspx_push_body_count_spring_005fbind_005f1))
                return;
              out.write("</td>\r\n");
              out.write("                  <td class=\"formField\" width=\"250\">\r\n");
              out.write("                    <input type=\"text\" name=\"view.xid\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\"/>\r\n");
              out.write("                  </td>\r\n");
              out.write("                  <td class=\"formError\">");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("</td>\r\n");
              out.write("                </tr>\r\n");
              out.write("              ");
              int evalDoAfterBody = _jspx_th_spring_005fbind_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_spring_005fbind_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            throw new SkipPageException();
          }
        } catch (Throwable _jspx_exception) {
          while (_jspx_push_body_count_spring_005fbind_005f1[0]-- > 0)
            out = _jspx_page_context.popBody();
          _jspx_th_spring_005fbind_005f1.doCatch(_jspx_exception);
        } finally {
          _jspx_th_spring_005fbind_005f1.doFinally();
        }
        _005fjspx_005ftagPool_005fspring_005fbind_0026_005fpath.reuse(_jspx_th_spring_005fbind_005f1);
        _jspx_th_spring_005fbind_005f1_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_spring_005fbind_005f1, _jsp_annotationprocessor, _jspx_th_spring_005fbind_005f1_reused);
      }
      out.write("\r\n");
      out.write("              ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_005fbind_005f2 = (org.springframework.web.servlet.tags.BindTag) _005fjspx_005ftagPool_005fspring_005fbind_0026_005fpath.get(org.springframework.web.servlet.tags.BindTag.class);
      boolean _jspx_th_spring_005fbind_005f2_reused = false;
      try {
        _jspx_th_spring_005fbind_005f2.setPageContext(_jspx_page_context);
        _jspx_th_spring_005fbind_005f2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
        // /WEB-INF/jsp/viewEdit.jsp(302,14) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_spring_005fbind_005f2.setPath("form.backgroundImageMP");
        int[] _jspx_push_body_count_spring_005fbind_005f2 = new int[] { 0 };
        try {
          int _jspx_eval_spring_005fbind_005f2 = _jspx_th_spring_005fbind_005f2.doStartTag();
          if (_jspx_eval_spring_005fbind_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                <tr>\r\n");
              out.write("                  <td class=\"formLabelRequired\">");
              if (_jspx_meth_fmt_005fmessage_005f3(_jspx_th_spring_005fbind_005f2, _jspx_page_context, _jspx_push_body_count_spring_005fbind_005f2))
                return;
              out.write("</td>\r\n");
              out.write("                  <td class=\"formField\">\r\n");
              out.write("                    <input type=\"file\" name=\"backgroundImageMP\"/>\r\n");
              out.write("                  </td>\r\n");
              out.write("                  <td class=\"formError\">");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("</td>\r\n");
              out.write("                </tr>\r\n");
              out.write("              ");
              int evalDoAfterBody = _jspx_th_spring_005fbind_005f2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_spring_005fbind_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            throw new SkipPageException();
          }
        } catch (Throwable _jspx_exception) {
          while (_jspx_push_body_count_spring_005fbind_005f2[0]-- > 0)
            out = _jspx_page_context.popBody();
          _jspx_th_spring_005fbind_005f2.doCatch(_jspx_exception);
        } finally {
          _jspx_th_spring_005fbind_005f2.doFinally();
        }
        _005fjspx_005ftagPool_005fspring_005fbind_0026_005fpath.reuse(_jspx_th_spring_005fbind_005f2);
        _jspx_th_spring_005fbind_005f2_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_spring_005fbind_005f2, _jsp_annotationprocessor, _jspx_th_spring_005fbind_005f2_reused);
      }
      out.write("\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td colspan=\"2\" align=\"center\">\r\n");
      out.write("                  <input type=\"submit\" name=\"upload\" value=\"");
      if (_jspx_meth_fmt_005fmessage_005f4(_jspx_parent, _jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                  <input type=\"submit\" name=\"clearImage\" value=\"");
      if (_jspx_meth_fmt_005fmessage_005f5(_jspx_parent, _jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_005fbind_005f3 = (org.springframework.web.servlet.tags.BindTag) _005fjspx_005ftagPool_005fspring_005fbind_0026_005fpath.get(org.springframework.web.servlet.tags.BindTag.class);
      boolean _jspx_th_spring_005fbind_005f3_reused = false;
      try {
        _jspx_th_spring_005fbind_005f3.setPageContext(_jspx_page_context);
        _jspx_th_spring_005fbind_005f3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
        // /WEB-INF/jsp/viewEdit.jsp(318,14) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_spring_005fbind_005f3.setPath("form.view.anonymousAccess");
        int[] _jspx_push_body_count_spring_005fbind_005f3 = new int[] { 0 };
        try {
          int _jspx_eval_spring_005fbind_005f3 = _jspx_th_spring_005fbind_005f3.doStartTag();
          if (_jspx_eval_spring_005fbind_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                <tr>\r\n");
              out.write("                  <td class=\"formLabelRequired\" width=\"150\">");
              if (_jspx_meth_fmt_005fmessage_005f6(_jspx_th_spring_005fbind_005f3, _jspx_page_context, _jspx_push_body_count_spring_005fbind_005f3))
                return;
              out.write("</td>\r\n");
              out.write("                  <td class=\"formField\" width=\"250\">\r\n");
              out.write("                    ");
              //  sst:select
              com.serotonin.web.taglib.SelectTag _jspx_th_sst_005fselect_005f0 = (com.serotonin.web.taglib.SelectTag) _005fjspx_005ftagPool_005fsst_005fselect_0026_005fvalue_005fname.get(com.serotonin.web.taglib.SelectTag.class);
              boolean _jspx_th_sst_005fselect_005f0_reused = false;
              try {
                _jspx_th_sst_005fselect_005f0.setPageContext(_jspx_page_context);
                _jspx_th_sst_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005fbind_005f3);
                // /WEB-INF/jsp/viewEdit.jsp(322,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_sst_005fselect_005f0.setName("view.anonymousAccess");
                // /WEB-INF/jsp/viewEdit.jsp(322,20) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_sst_005fselect_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                int _jspx_eval_sst_005fselect_005f0 = _jspx_th_sst_005fselect_005f0.doStartTag();
                if (_jspx_eval_sst_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\r\n");
                    out.write("                      ");
                    //  sst:option
                    com.serotonin.web.taglib.OptionTag _jspx_th_sst_005foption_005f0 = (com.serotonin.web.taglib.OptionTag) _005fjspx_005ftagPool_005fsst_005foption_0026_005fvalue.get(com.serotonin.web.taglib.OptionTag.class);
                    boolean _jspx_th_sst_005foption_005f0_reused = false;
                    try {
                      _jspx_th_sst_005foption_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_sst_005foption_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_005fselect_005f0);
                      // /WEB-INF/jsp/viewEdit.jsp(323,22) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_sst_005foption_005f0.setValue( Integer.toString(ShareUser.ACCESS_NONE) );
                      int _jspx_eval_sst_005foption_005f0 = _jspx_th_sst_005foption_005f0.doStartTag();
                      if (_jspx_eval_sst_005foption_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_sst_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          _jspx_push_body_count_spring_005fbind_005f3[0]++;
                          out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_sst_005foption_005f0);
                        }
                        do {
                          if (_jspx_meth_fmt_005fmessage_005f7(_jspx_th_sst_005foption_005f0, _jspx_page_context, _jspx_push_body_count_spring_005fbind_005f3))
                            return;
                          int evalDoAfterBody = _jspx_th_sst_005foption_005f0.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_sst_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                          _jspx_push_body_count_spring_005fbind_005f3[0]--;
                        }
                      }
                      if (_jspx_th_sst_005foption_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        throw new SkipPageException();
                      }
                      _005fjspx_005ftagPool_005fsst_005foption_0026_005fvalue.reuse(_jspx_th_sst_005foption_005f0);
                      _jspx_th_sst_005foption_005f0_reused = true;
                    } finally {
                      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sst_005foption_005f0, _jsp_annotationprocessor, _jspx_th_sst_005foption_005f0_reused);
                    }
                    out.write("\r\n");
                    out.write("                      ");
                    //  sst:option
                    com.serotonin.web.taglib.OptionTag _jspx_th_sst_005foption_005f1 = (com.serotonin.web.taglib.OptionTag) _005fjspx_005ftagPool_005fsst_005foption_0026_005fvalue.get(com.serotonin.web.taglib.OptionTag.class);
                    boolean _jspx_th_sst_005foption_005f1_reused = false;
                    try {
                      _jspx_th_sst_005foption_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_sst_005foption_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_005fselect_005f0);
                      // /WEB-INF/jsp/viewEdit.jsp(324,22) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_sst_005foption_005f1.setValue( Integer.toString(ShareUser.ACCESS_READ) );
                      int _jspx_eval_sst_005foption_005f1 = _jspx_th_sst_005foption_005f1.doStartTag();
                      if (_jspx_eval_sst_005foption_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_sst_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          _jspx_push_body_count_spring_005fbind_005f3[0]++;
                          out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_sst_005foption_005f1);
                        }
                        do {
                          if (_jspx_meth_fmt_005fmessage_005f8(_jspx_th_sst_005foption_005f1, _jspx_page_context, _jspx_push_body_count_spring_005fbind_005f3))
                            return;
                          int evalDoAfterBody = _jspx_th_sst_005foption_005f1.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_sst_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                          _jspx_push_body_count_spring_005fbind_005f3[0]--;
                        }
                      }
                      if (_jspx_th_sst_005foption_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        throw new SkipPageException();
                      }
                      _005fjspx_005ftagPool_005fsst_005foption_0026_005fvalue.reuse(_jspx_th_sst_005foption_005f1);
                      _jspx_th_sst_005foption_005f1_reused = true;
                    } finally {
                      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sst_005foption_005f1, _jsp_annotationprocessor, _jspx_th_sst_005foption_005f1_reused);
                    }
                    out.write("\r\n");
                    out.write("                      ");
                    //  sst:option
                    com.serotonin.web.taglib.OptionTag _jspx_th_sst_005foption_005f2 = (com.serotonin.web.taglib.OptionTag) _005fjspx_005ftagPool_005fsst_005foption_0026_005fvalue.get(com.serotonin.web.taglib.OptionTag.class);
                    boolean _jspx_th_sst_005foption_005f2_reused = false;
                    try {
                      _jspx_th_sst_005foption_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_sst_005foption_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_005fselect_005f0);
                      // /WEB-INF/jsp/viewEdit.jsp(325,22) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_sst_005foption_005f2.setValue( Integer.toString(ShareUser.ACCESS_SET) );
                      int _jspx_eval_sst_005foption_005f2 = _jspx_th_sst_005foption_005f2.doStartTag();
                      if (_jspx_eval_sst_005foption_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_sst_005foption_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          _jspx_push_body_count_spring_005fbind_005f3[0]++;
                          out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_sst_005foption_005f2);
                        }
                        do {
                          if (_jspx_meth_fmt_005fmessage_005f9(_jspx_th_sst_005foption_005f2, _jspx_page_context, _jspx_push_body_count_spring_005fbind_005f3))
                            return;
                          int evalDoAfterBody = _jspx_th_sst_005foption_005f2.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_sst_005foption_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                          _jspx_push_body_count_spring_005fbind_005f3[0]--;
                        }
                      }
                      if (_jspx_th_sst_005foption_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        throw new SkipPageException();
                      }
                      _005fjspx_005ftagPool_005fsst_005foption_0026_005fvalue.reuse(_jspx_th_sst_005foption_005f2);
                      _jspx_th_sst_005foption_005f2_reused = true;
                    } finally {
                      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sst_005foption_005f2, _jsp_annotationprocessor, _jspx_th_sst_005foption_005f2_reused);
                    }
                    out.write("\r\n");
                    out.write("                    ");
                    int evalDoAfterBody = _jspx_th_sst_005fselect_005f0.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                }
                if (_jspx_th_sst_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  throw new SkipPageException();
                }
                _005fjspx_005ftagPool_005fsst_005fselect_0026_005fvalue_005fname.reuse(_jspx_th_sst_005fselect_005f0);
                _jspx_th_sst_005fselect_005f0_reused = true;
              } finally {
                org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sst_005fselect_005f0, _jsp_annotationprocessor, _jspx_th_sst_005fselect_005f0_reused);
              }
              out.write("\r\n");
              out.write("                  </td>\r\n");
              out.write("                  <td class=\"formError\">");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("</td>\r\n");
              out.write("                </tr>\r\n");
              out.write("              ");
              int evalDoAfterBody = _jspx_th_spring_005fbind_005f3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_spring_005fbind_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            throw new SkipPageException();
          }
        } catch (Throwable _jspx_exception) {
          while (_jspx_push_body_count_spring_005fbind_005f3[0]-- > 0)
            out = _jspx_page_context.popBody();
          _jspx_th_spring_005fbind_005f3.doCatch(_jspx_exception);
        } finally {
          _jspx_th_spring_005fbind_005f3.doFinally();
        }
        _005fjspx_005ftagPool_005fspring_005fbind_0026_005fpath.reuse(_jspx_th_spring_005fbind_005f3);
        _jspx_th_spring_005fbind_005f3_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_spring_005fbind_005f3, _jsp_annotationprocessor, _jspx_th_spring_005fbind_005f3_reused);
      }
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("          </div>\r\n");
      out.write("        </td>\r\n");
      out.write("        \t\r\n");
      out.write("        <td valign=\"top\">\r\n");
      out.write("          <div class=\"borderDiv\">\r\n");
      out.write("            ");
      if (_jspx_meth_tag_005fsharedUsers_005f0(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("          </div>\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    \r\n");
      out.write("    <table>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>\r\n");
      out.write("          ");
      if (_jspx_meth_fmt_005fmessage_005f10(_jspx_parent, _jspx_page_context))
        return;
      out.write(":\r\n");
      out.write("          <select id=\"componentList\"></select>\r\n");
      out.write("          ");
      if (_jspx_meth_tag_005fimg_005f1(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("        <td style=\"width:30px;\"></td>\r\n");
      out.write("       \r\n");
      out.write("        <td>\r\n");
      out.write("          <input type=\"checkbox\" id=\"iconifyCB\" onclick=\"iconizeClicked();\"/>\r\n");
      out.write("          <label for=\"iconifyCB\">");
      if (_jspx_meth_fmt_005fmessage_005f11(_jspx_parent, _jspx_page_context))
        return;
      out.write("</label>\r\n");
      out.write("        </td>\r\n");
      out.write("        \r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    \r\n");
      out.write("    <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>\r\n");
      out.write("          <table cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td colspan=\"3\">\r\n");
      out.write("                <div id=\"viewContent\" class=\"borderDiv\" style=\"left:0px;top:0px;float:left;\r\n");
      out.write("                        padding-right:1px;padding-bottom:1px;\">\r\n");
      out.write("                  ");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                  \r\n");
      out.write("                  ");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<div id=\"staticEditorPopup\" style=\"display:none;left:0px;top:0px;\" class=\"windowDiv\">\r\n");
      out.write("  <table cellpadding=\"0\" cellspacing=\"0\"><tr><td>\r\n");
      out.write("    <table width=\"100%\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>\r\n");
      out.write("          ");
      if (_jspx_meth_tag_005fimg_005f2(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("        <td align=\"right\">\r\n");
      out.write("          ");
      if (_jspx_meth_tag_005fimg_005f3(_jspx_parent, _jspx_page_context))
        return;
      out.write("&nbsp;\r\n");
      out.write("          ");
      if (_jspx_meth_tag_005fimg_005f4(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    <table id=\"htmlEditor\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td class=\"formField\"><textarea id=\"staticPointContent\" rows=\"10\" cols=\"50\"></textarea></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    <table id=\"linkEditor\">\r\n");
      out.write("      <tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f12(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"linkText\" type=\"text\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f13(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"linkLink\" type=\"text\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f14(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("        <td class=\"formField\"><select id=\"viewsList\" onchange=\"staticEditor.viewSelectChanged(this.value)\"></select></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    <table id=\"scriptButtonEditor\">\r\n");
      out.write("      \t<tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f15(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"scriptButtonText\" type=\"text\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("        \t<td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f16(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("        \t<td class=\"formField\"><select id=\"scriptsList\"></select></td>\r\n");
      out.write("      \t</tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    <table id=\"flexBuilderEditor\">\r\n");
      out.write("      \t<tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f17(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"flexWidth\" type=\"text\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f18(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"flexHeight\" type=\"text\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f19(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"flexProjectDefined\" type=\"checkbox\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f20(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input  id=\"flexProjectsSource\" type=\"text\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("        \t<td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f21(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("        \t<td class=\"formField\"><select id=\"flexProjectsList\"></select></td>\r\n");
      out.write("      \t</tr>  \r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f22(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"flexRuntimeMode\" type=\"checkbox\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    <table id=\"chartComparatorEditor\">\r\n");
      out.write("      \t<tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f23(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"chartComparatorWidth\" type=\"text\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f24(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"chartComparatorHeight\" type=\"text\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("  </td></tr></table>\r\n");
      out.write("  \r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("    function StaticEditor() {\r\n");
      out.write("        this.componentId = null;\r\n");
      out.write("        this.component = null;\r\n");
      out.write("        \r\n");
      out.write("        this.open = function(compId) {\r\n");
      out.write("            hide('htmlEditor');\r\n");
      out.write("            hide('linkEditor');\r\n");
      out.write("            hide('scriptButtonEditor');\r\n");
      out.write("            hide('flexBuilderEditor');\r\n");
      out.write("            hide('chartComparatorEditor');\r\n");
      out.write("            \r\n");
      out.write("            staticEditor.componentId = compId;\r\n");
      out.write("            ViewDwr.getViewComponent(compId, function(comp) {\r\n");
      out.write("                // Update the data in the form.\r\n");
      out.write("                staticEditor.component = comp;\r\n");
      out.write("                \r\n");
      out.write("\t\t\t\tif(comp.defName == 'html') {\r\n");
      out.write("\t\t\t\t\t$set(\"staticPointContent\", comp.content);\r\n");
      out.write("\t\t\t\t\tshow('htmlEditor');\r\n");
      out.write("\t\t            hide('linkEditor');\r\n");
      out.write("\t\t            hide('scriptButtonEditor');\r\n");
      out.write("\t\t            hide('flexBuilderEditor');\r\n");
      out.write("\t\t            \r\n");
      out.write("\t\t            show(\"staticEditorPopup\");\r\n");
      out.write("\t\t\t\t} else if(comp.defName == 'link'){\r\n");
      out.write("\t\t\t\t\tViewDwr.getViews(function(views) {\r\n");
      out.write("\t\t\t\t\t\tstaticEditor.updateViewsList(views);\r\n");
      out.write("\t\t            });\r\n");
      out.write("\t\t\t\t\t$set(\"staticPointContent\", comp.content);\r\n");
      out.write("\t\t\t\t\t$set(\"linkText\", comp.text);\r\n");
      out.write("\t\t\t\t\t$set(\"linkLink\", comp.link);\r\n");
      out.write("\t\t\t\t\thide('htmlEditor');\r\n");
      out.write("\t\t\t\t\thide('scriptButtonEditor');\r\n");
      out.write("\t\t\t\t\thide('flexBuilderEditor');\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t            show('linkEditor');\r\n");
      out.write("\t\t            show(\"staticEditorPopup\");\r\n");
      out.write("\t\t\t\t} else if(comp.defName == 'scriptButton'){\r\n");
      out.write("\t\t\t\t\tViewDwr.getScripts(function(scripts) {\r\n");
      out.write("\t\t\t\t\t\tstaticEditor.updateScriptsList(scripts);\r\n");
      out.write("\t\t\t\t\t\t$set(\"scriptsList\", comp.scriptXid);\r\n");
      out.write("\t\t            });\r\n");
      out.write("\t\t\t\t\t$set(\"staticPointContent\", comp.content);\r\n");
      out.write("\t\t\t\t\t$set(\"scriptButtonText\", comp.text);\r\n");
      out.write("\t\t\t\t\thide('htmlEditor');\r\n");
      out.write("\t\t\t\t\thide('linkEditor');\r\n");
      out.write("\t\t\t\t\thide('flexBuilderEditor');\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t            show('scriptButtonEditor');\r\n");
      out.write("\t\t            show(\"staticEditorPopup\");\r\n");
      out.write("\t\t\t\t} else if(comp.defName == 'flexBuilder'){\r\n");
      out.write("\t\t\t\t\tViewDwr.getFlexProjects(function(flexProjects) {\r\n");
      out.write("\t\t\t\t\t\tstaticEditor.updateFlexProjectsList(flexProjects);\r\n");
      out.write("\t\t\t\t\t\t$set(\"flexProjectsList\", comp.projectId);\r\n");
      out.write("\t\t            });\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t$set(\"staticPointContent\", comp.content);\r\n");
      out.write("\t\t\t\t\t$set(\"flexWidth\", comp.width);\r\n");
      out.write("\t\t\t\t\t$set(\"flexHeight\", comp.height);\r\n");
      out.write("\t\t\t\t\t$set(\"flexProjectDefined\", comp.projectDefined);\r\n");
      out.write("\t\t\t\t\t$set(\"flexProjectsSource\", comp.projectSource);\r\n");
      out.write("\t\t\t\t\t$set(\"flexRuntimeMode\", comp.runtimeMode);\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\thide('htmlEditor');\r\n");
      out.write("\t\t\t\t\thide('linkEditor');\r\n");
      out.write("\t\t\t\t\thide('scriptButtonEditor');\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t            show('flexBuilderEditor');\r\n");
      out.write("\t\t            show(\"staticEditorPopup\");\r\n");
      out.write("\t\t\t\t} else if(comp.defName == 'chartComparator'){\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t$set(\"chartComparatorWidth\", comp.width);\r\n");
      out.write("\t\t\t\t\t$set(\"chartComparatorHeight\", comp.height);\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t            show('chartComparatorEditor');\r\n");
      out.write("\t\t            show(\"staticEditorPopup\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("            });\r\n");
      out.write("            positionEditor(compId, \"staticEditorPopup\");\r\n");
      out.write("        };\r\n");
      out.write("        \r\n");
      out.write("        this.close = function() {\r\n");
      out.write("            hide(\"staticEditorPopup\");\r\n");
      out.write("        };\r\n");
      out.write("        \r\n");
      out.write("        this.save = function() {\r\n");
      out.write("\t\t\tif(staticEditor.component.defName == 'html') {\r\n");
      out.write("\t\t\t\tViewDwr.saveHtmlComponent(staticEditor.componentId, $get(\"staticPointContent\"), function() {\r\n");
      out.write("\t                staticEditor.close();\r\n");
      out.write("\t                updateHtmlComponentContent(\"c\"+ staticEditor.componentId, $get(\"staticPointContent\"));\r\n");
      out.write("\t            });\r\n");
      out.write("\t\t\t} else if(staticEditor.component.defName == 'link') {\r\n");
      out.write("\t\t\t\tViewDwr.saveLinkComponent(staticEditor.componentId, $get(\"linkText\"), $get(\"linkLink\"), function(response) {\r\n");
      out.write("\t\t\t\t\tif (response.hasMessages)\r\n");
      out.write("\t\t\t        \tshowDwrMessages(response.messages);\r\n");
      out.write("\t\t\t\t\telse {\r\n");
      out.write("\t\t\t\t\t\tstaticEditor.close();\r\n");
      out.write("\t\t                tempContent = \"<a> \" +$get(\"linkText\") +\"</a>\";\r\n");
      out.write("\t\t                updateHtmlComponentContent(\"c\"+ staticEditor.componentId, tempContent);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t                \r\n");
      out.write("\t            });\r\n");
      out.write("\t\t\t} else if(staticEditor.component.defName == 'scriptButton') {\r\n");
      out.write("\t\t\t\tViewDwr.saveScriptButtonComponent(staticEditor.componentId, $get(\"scriptButtonText\"), $get(\"scriptsList\"), function(response) {\r\n");
      out.write("\t\t\t\t\tif (response.hasMessages)\r\n");
      out.write("\t\t\t        \tshowDwrMessages(response.messages);\r\n");
      out.write("\t\t\t\t\telse {\r\n");
      out.write("\t\t\t\t\t\tstaticEditor.close();\r\n");
      out.write("\t\t                tempContent = \"<button> \" +$get(\"scriptButtonText\") +\"</button>\";\r\n");
      out.write("\t\t                updateHtmlComponentContent(\"c\"+ staticEditor.componentId, tempContent);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t                \r\n");
      out.write("\t            });\r\n");
      out.write("\t\t\t} else if(staticEditor.component.defName == 'flexBuilder') {\r\n");
      out.write("\t\t\t\tViewDwr.saveFlexBuilderComponent(staticEditor.componentId, $get(\"flexWidth\"), $get(\"flexHeight\"),\r\n");
      out.write("\t\t\t\t\t\t$get(\"flexProjectDefined\"),$get(\"flexProjectsSource\"),$get(\"flexProjectsList\"),$get(\"flexRuntimeMode\"),\r\n");
      out.write("\t\t\t\t\tfunction(response) {\r\n");
      out.write("\t\t\t\t\t\tif (response.hasMessages)\r\n");
      out.write("\t\t\t\t        \tshowDwrMessages(response.messages);\r\n");
      out.write("\t\t\t\t\t\telse {\r\n");
      out.write("\t\t\t\t\t\t\tstaticEditor.close();\r\n");
      out.write("\t\t\t                tempContent = \"<div style='background-color: silver; border: 1px solid red; width: \"+ $get(\"flexWidth\") +\"px; height: \"+$get(\"flexHeight\") +\"px;'> <b> ");
      if (_jspx_meth_fmt_005fmessage_005f25(_jspx_parent, _jspx_page_context))
        return;
      out.write(" </b> </div>\";\r\n");
      out.write("\r\n");
      out.write("\t\t\t                componentId = \"c\"+ staticEditor.componentId;\r\n");
      out.write("\t\t\t                updateHtmlComponentContent(componentId, tempContent);\r\n");
      out.write("\t\t\t                //$(componentId).style.top=  \"0px\";\r\n");
      out.write("\t\t\t                //$(componentId).style.left=  \"0px\";\r\n");
      out.write("\t\t\t                //updateViewComponentLocation(componentId);\r\n");
      out.write("\r\n");
      out.write("\t\t\t                //resizeViewBackground($get(\"flexWidth\"), $get(\"flexHeight\"));\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t            });\r\n");
      out.write("\t\t\t} else if(staticEditor.component.defName == 'chartComparator') {\r\n");
      out.write("\t\t\t\tViewDwr.saveChartComparatorComponent(staticEditor.componentId, $get(\"chartComparatorWidth\"), $get(\"chartComparatorHeight\"),\r\n");
      out.write("\t\t\t\t\tfunction(response) {\r\n");
      out.write("\t\t\t\t\t\tif (response.hasMessages)\r\n");
      out.write("\t\t\t\t        \tshowDwrMessages(response.messages);\r\n");
      out.write("\t\t\t\t\t\telse {\r\n");
      out.write("\t\t\t\t\t\t\tstaticEditor.close();\r\n");
      out.write("\t\t\t                tempContent = \r\n");
      out.write("\t\t\t\t                \"<div style='background-color: silver; border: 1px solid red; width: \"+ ($get(\"chartComparatorWidth\")*2) +\"px; height: \"+$get(\"chartComparatorHeight\") +\"px;'> <b> ");
      if (_jspx_meth_fmt_005fmessage_005f26(_jspx_parent, _jspx_page_context))
        return;
      out.write(" </b> </div>\";\r\n");
      out.write("\t\t\t                componentId = \"c\"+ staticEditor.componentId;\r\n");
      out.write("\t\t\t                updateHtmlComponentContent(componentId, tempContent);\r\n");
      out.write("\t\t\t                //$(componentId).style.top=  \"0px\";\r\n");
      out.write("\t\t\t                //$(componentId).style.left=  \"0px\";\r\n");
      out.write("\t\t\t                //updateViewComponentLocation(componentId);\r\n");
      out.write("\r\n");
      out.write("\t\t\t                //resizeViewBackground($get(\"flexWidth\"), $get(\"flexHeight\"));\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t            });\r\n");
      out.write("\t\t\t}\r\n");
      out.write("            \r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        this.updateViewsList = function(views) {\r\n");
      out.write("            dwr.util.removeAllOptions(\"viewsList\");\r\n");
      out.write("            var sel = $(\"viewsList\");\r\n");
      out.write("            sel.options[0] = new Option(\"\", 0);\r\n");
      out.write("            for (var i=0; i<views.length; i++) {\r\n");
      out.write("                sel.options[i+1] = new Option(views[i].value, views[i].key);\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        this.updateScriptsList = function(scripts) {\r\n");
      out.write("            dwr.util.removeAllOptions(\"scriptsList\");\r\n");
      out.write("            var sel = $(\"scriptsList\");\r\n");
      out.write("            for (var i=0; i<scripts.length; i++) {\r\n");
      out.write("                sel.options[i] = new Option(scripts[i].name, scripts[i].xid);\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        this.updateFlexProjectsList = function(flexProjects) {\r\n");
      out.write("            dwr.util.removeAllOptions(\"flexProjectsList\");\r\n");
      out.write("            var sel = $(\"flexProjectsList\");\r\n");
      out.write("            for (var i=0; i<flexProjects.length; i++) {\r\n");
      out.write("                sel.options[i] = new Option(flexProjects[i].name, flexProjects[i].id);\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        this.viewSelectChanged = function(value) {\r\n");
      out.write("        \t$set(\"linkLink\",\"\");\r\n");
      out.write("            if(value!=0) {\r\n");
      out.write("            \tlink = getAbsolutePath()+\"views.shtm?viewId=\"+value;\r\n");
      out.write("                $set(\"linkLink\",link);\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function getAbsolutePath() {\r\n");
      out.write("        var loc = window.location;\r\n");
      out.write("        var pathName = loc.pathname.substring(0, loc.pathname.lastIndexOf('/') + 1);\r\n");
      out.write("        return loc.href.substring(0, loc.href.length - ((loc.pathname + loc.search + loc.hash).length - pathName.length));\r\n");
      out.write("    }\r\n");
      out.write("        \r\n");
      out.write("    var staticEditor = new StaticEditor();\r\n");
      out.write("  </script>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("                  ");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<div id=\"settingsEditorPopup\" style=\"display:none;left:0px;top:0px;\" class=\"windowDiv\">\r\n");
      out.write("  <table cellpadding=\"0\" cellspacing=\"0\"><tr><td>\r\n");
      out.write("    <table width=\"100%\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>\r\n");
      out.write("          ");
      if (_jspx_meth_tag_005fimg_005f5(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("          <span class=\"copyTitle\" id=\"settingsComponentName\"></span>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td align=\"right\">\r\n");
      out.write("          ");
      if (_jspx_meth_tag_005fimg_005f6(_jspx_parent, _jspx_page_context))
        return;
      out.write("&nbsp;\r\n");
      out.write("          ");
      if (_jspx_meth_tag_005fimg_005f7(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    <table>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f27(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("        <td class=\"formField\"><select id=\"settingsPointList\" onchange=\"settingsEditor.pointSelectChanged()\"></select></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_005fmessage_005f28(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("        <td class=\"formField\"><input id=\"settingsPointName\" type=\"text\"/></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_005fmessage_005f29(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("        <td class=\"formField\"><input id=\"settingsSettable\" type=\"checkbox\"/></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_005fmessage_005f30(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("        <td class=\"formField\"><input id=\"settingsBkgdColor\" type=\"text\"/></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_005fmessage_005f31(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("        <td class=\"formField\"><input id=\"settingsControls\" type=\"checkbox\"/></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("  </td></tr></table>\r\n");
      out.write("  \r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("    // Script requires\r\n");
      out.write("    //  - Drag and Drop library for locating objects and positioning the window.\r\n");
      out.write("    //  - DWR utils for using $() prototype.\r\n");
      out.write("    //  - common.js\r\n");
      out.write("    function SettingsEditor() {\r\n");
      out.write("        this.componentId = null;\r\n");
      out.write("        this.pointList = [];\r\n");
      out.write("        \r\n");
      out.write("        this.open = function(compId) {\r\n");
      out.write("            settingsEditor.componentId = compId;\r\n");
      out.write("            \r\n");
      out.write("            ViewDwr.getViewComponent(compId, function(comp) {\r\n");
      out.write("                $set(\"settingsComponentName\", comp.displayName);\r\n");
      out.write("                \r\n");
      out.write("                // Update the point list\r\n");
      out.write("                settingsEditor.updatePointList(comp.supportedDataTypes);\r\n");
      out.write("                \r\n");
      out.write("                // Update the data in the form.\r\n");
      out.write("                $set(\"settingsPointList\", comp.dataPointId);\r\n");
      out.write("                $set(\"settingsPointName\", comp.nameOverride);\r\n");
      out.write("                $set(\"settingsSettable\", comp.settableOverride);\r\n");
      out.write("                $set(\"settingsBkgdColor\", comp.bkgdColorOverride);\r\n");
      out.write("                $set(\"settingsControls\", comp.displayControls);\r\n");
      out.write("                \r\n");
      out.write("                settingsEditor.pointSelectChanged();\r\n");
      out.write("                show(\"settingsEditorPopup\");\r\n");
      out.write("            });\r\n");
      out.write("            \r\n");
      out.write("            positionEditor(compId, \"settingsEditorPopup\");\r\n");
      out.write("        };\r\n");
      out.write("        \r\n");
      out.write("        this.close = function() {\r\n");
      out.write("            hide(\"settingsEditorPopup\");\r\n");
      out.write("            hideContextualMessages(\"settingsEditorPopup\");\r\n");
      out.write("        };\r\n");
      out.write("        \r\n");
      out.write("        this.save = function() {\r\n");
      out.write("            hideContextualMessages(\"settingsEditorPopup\");\r\n");
      out.write("            ViewDwr.setPointComponentSettings(settingsEditor.componentId, $get(\"settingsPointList\"),\r\n");
      out.write("                    $get(\"settingsPointName\"), $get(\"settingsSettable\"), $get(\"settingsBkgdColor\"),\r\n");
      out.write("                    $get(\"settingsControls\"), function(response) {\r\n");
      out.write("                if (response.hasMessages) {\r\n");
      out.write("                    showDwrMessages(response.messages);\r\n");
      out.write("                }\r\n");
      out.write("                else {\r\n");
      out.write("                    settingsEditor.close();\r\n");
      out.write("                    MiscDwr.notifyLongPoll(mango.longPoll.pollSessionId);\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        };\r\n");
      out.write("        \r\n");
      out.write("        this.setPointList = function(pointList) {\r\n");
      out.write("            settingsEditor.pointList = pointList;\r\n");
      out.write("        };\r\n");
      out.write("        \r\n");
      out.write("        this.pointSelectChanged = function() {\r\n");
      out.write("            var point = getElement(settingsEditor.pointList, $get(\"settingsPointList\"));\r\n");
      out.write("            if (!point || !point.settable) {\r\n");
      out.write("                $set(\"settingsSettable\", false);\r\n");
      out.write("                $(\"settingsSettable\").disabled = true;\r\n");
      out.write("            }\r\n");
      out.write("            else\r\n");
      out.write("                $(\"settingsSettable\").disabled = false;\r\n");
      out.write("        };\r\n");
      out.write("        \r\n");
      out.write("        this.updatePointList = function(dataTypes) {\r\n");
      out.write("            dwr.util.removeAllOptions(\"settingsPointList\");\r\n");
      out.write("            var sel = $(\"settingsPointList\");\r\n");
      out.write("            sel.options[0] = new Option(\"\", 0);\r\n");
      out.write("            \r\n");
      out.write("            for (var i=0; i<settingsEditor.pointList.length; i++) {\r\n");
      out.write("                if (contains(dataTypes, settingsEditor.pointList[i].dataType))\r\n");
      out.write("                    sel.options[sel.options.length] = new Option(settingsEditor.pointList[i].name,\r\n");
      out.write("                            settingsEditor.pointList[i].id);\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("    }\r\n");
      out.write("    var settingsEditor = new SettingsEditor();\r\n");
      out.write("  </script>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("                  ");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<div id=\"graphicRendererEditorPopup\" style=\"display:none;left:0px;top:0px;\" class=\"windowDiv\">\r\n");
      out.write("  <table cellpadding=\"0\" cellspacing=\"0\"><tr><td>\r\n");
      out.write("    <table width=\"100%\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>\r\n");
      out.write("          ");
      if (_jspx_meth_tag_005fimg_005f8(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("          <span class=\"copyTitle\" id=\"graphicsComponentName\"></span>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td align=\"right\">\r\n");
      out.write("          ");
      if (_jspx_meth_tag_005fimg_005f9(_jspx_parent, _jspx_page_context))
        return;
      out.write("&nbsp;\r\n");
      out.write("          ");
      if (_jspx_meth_tag_005fimg_005f10(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    \r\n");
      out.write("    <table>\r\n");
      out.write("      <tbody id=\"graphicRenderer_analogGraphic\" style=\"display:none;\">\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f32(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"graphicRendererAnalogMin\" type=\"text\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f33(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"graphicRendererAnalogMax\" type=\"text\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f34(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"graphicRendererAnalogDisplayText\" type=\"checkbox\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f35(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td>\r\n");
      out.write("            <select id=\"graphicRendererAnalogImageSet\" onchange=\"graphicRendererEditor.updateSampleImageSet(this)\">\r\n");
      out.write("              <option value=\"\"></option>\r\n");
      out.write("              ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </select><br/>\r\n");
      out.write("            <img id=\"graphicRendererAnalogImageSetSample\"/>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </tbody>\r\n");
      out.write("      \r\n");
      out.write("      <tbody id=\"graphicRenderer_binaryGraphic\" style=\"display:none;\">\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f37(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"graphicRendererBinaryDisplayText\" type=\"checkbox\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f38(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td>\r\n");
      out.write("            <select id=\"graphicRendererBinaryImageSet\" onchange=\"graphicRendererEditor.displayBinaryImages($get(this));\">\r\n");
      out.write("              <option value=\"\"></option>\r\n");
      out.write("              ");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </select>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f40(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\">\r\n");
      out.write("            <div id=\"graphicRendererBinaryImageSetZero\" style=\"width:200px; overflow:auto; white-space:nowrap;\"></div>\r\n");
      out.write("            <input type=\"hidden\" id=\"graphicRendererBinaryImageSetZeroMsg\"/>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f41(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\">\r\n");
      out.write("            <div id=\"graphicRendererBinaryImageSetOne\" style=\"width:200px; overflow:auto; white-space:nowrap;\"></div>\r\n");
      out.write("            <input type=\"hidden\" id=\"graphicRendererBinaryImageSetOneMsg\"/>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </tbody>\r\n");
      out.write("      \r\n");
      out.write("      <tbody id=\"graphicRenderer_dynamicGraphic\" style=\"display:none;\">\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f42(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"graphicRendererDynamicMin\" type=\"text\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f43(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"graphicRendererDynamicMax\" type=\"text\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f44(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"graphicRendererDynamicDisplayText\" type=\"checkbox\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f45(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td>\r\n");
      out.write("            <select id=\"graphicRendererDynamicImage\" onchange=\"graphicRendererEditor.updateSampleDynamicImage(this)\">\r\n");
      out.write("              <option value=\"\"></option>\r\n");
      out.write("              ");
      if (_jspx_meth_c_005fforEach_005f3(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </select><br/>\r\n");
      out.write("            <img id=\"graphicRendererDynamicImageSample\"/>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </tbody>\r\n");
      out.write("      \r\n");
      out.write("      <tbody id=\"graphicRenderer_multistateGraphic\" style=\"display:none;\">\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f46(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"graphicRendererMultistateDisplayText\" type=\"checkbox\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f47(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td>\r\n");
      out.write("            <select id=\"graphicRendererMultistateImageSet\" onchange=\"graphicRendererEditor.displayMultistateImages($get(this));\">\r\n");
      out.write("              <option value=\"\"></option>\r\n");
      out.write("              ");
      if (_jspx_meth_c_005fforEach_005f4(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </select>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f49(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\" id=\"graphicRendererMultistateImageSetList\">\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </tbody>\r\n");
      out.write("      \r\n");
      out.write("      <tbody id=\"graphicRenderer_script\" style=\"display:none;\">\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td colspan=\"2\">\r\n");
      out.write("            <span class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f50(_jspx_parent, _jspx_page_context))
        return;
      out.write("</span><br/>\r\n");
      out.write("            <span class=\"formField\"><textarea id=\"graphicRendererScriptScript\" rows=\"10\" cols=\"50\"></textarea></span>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </tbody>\r\n");
      out.write("      \r\n");
      out.write("      <tbody id=\"graphicRenderer_simpleImage\" style=\"display:none;\">\r\n");
      out.write("        <tr><td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f51(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td></tr>\r\n");
      out.write("      </tbody>\r\n");
      out.write("      \r\n");
      out.write("      <tbody id=\"graphicRenderer_simple\" style=\"display:none;\">\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f52(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"graphicRendererSimpleDisplayPointName\" type=\"checkbox\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f53(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"graphicRendererSimpleStyleAttribute\" type=\"text\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </tbody>\r\n");
      out.write("      \r\n");
      out.write("      <tbody id=\"graphicRenderer_thumbnailImage\" style=\"display:none;\">\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f54(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"graphicRendererThumbnailScalePercent\" type=\"text\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </tbody>\r\n");
      out.write("      <tbody id=\"graphicRenderer_button\" style=\"display:none;\">\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f55(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"graphicRendererButtonWhenOnLabel\" type=\"text\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f56(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"graphicRendererButtonWhenOffLabel\" type=\"text\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f57(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"graphicRendererButtonHeight\" type=\"text\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f58(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"graphicRendererButtonWidth\" type=\"text\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        \r\n");
      out.write("      </tbody>\r\n");
      out.write("      \r\n");
      out.write("    </table>\r\n");
      out.write("  </td></tr></table>\r\n");
      out.write("  \r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("    // Script requires\r\n");
      out.write("    //  - Drag and Drop library for locating objects and positioning the window.\r\n");
      out.write("    //  - DWR utils for using $() prototype.\r\n");
      out.write("    //  - common.js\r\n");
      out.write("    function GraphicRendererEditor() {\r\n");
      out.write("        this.currentImageSetId = null;\r\n");
      out.write("        this.zeroImage = -1;\r\n");
      out.write("        this.oneImage = -1;\r\n");
      out.write("        this.componentId = null;\r\n");
      out.write("        this.typeName = null;\r\n");
      out.write("        this.imageSets = ");
      if (_jspx_meth_sst_005fconvert_005f1(_jspx_parent, _jspx_page_context))
        return;
      out.write(";\r\n");
      out.write("        this.dynamicImages = ");
      if (_jspx_meth_sst_005fconvert_005f2(_jspx_parent, _jspx_page_context))
        return;
      out.write(";\r\n");
      out.write("        \r\n");
      out.write("        this.open = function(compId) {\r\n");
      out.write("            graphicRendererEditor.currentImageSetId = null;\r\n");
      out.write("            graphicRendererEditor.zeroImage = -1;\r\n");
      out.write("            graphicRendererEditor.oneImage = -1;\r\n");
      out.write("        \r\n");
      out.write("            graphicRendererEditor.componentId = compId;\r\n");
      out.write("            \r\n");
      out.write("            // Set the renderers for the data type of this point view.\r\n");
      out.write("            ViewDwr.getViewComponent(compId, graphicRendererEditor.setViewComponent);\r\n");
      out.write("            \r\n");
      out.write("            positionEditor(compId, \"graphicRendererEditorPopup\");\r\n");
      out.write("        };\r\n");
      out.write("        \r\n");
      out.write("        this.setViewComponent = function(comp) {\r\n");
      out.write("            graphicRendererEditor.typeName = comp.typeName;\r\n");
      out.write("            $set(\"graphicsComponentName\", comp.displayName);\r\n");
      out.write("            \r\n");
      out.write("            // Clear the form data.\r\n");
      out.write("            $set(\"graphicRendererBinaryDisplayText\");\r\n");
      out.write("            $set(\"graphicRendererBinaryImageSet\");\r\n");
      out.write("            $set(\"graphicRendererMultistateDisplayText\");\r\n");
      out.write("            $set(\"graphicRendererMultistateImageSet\");\r\n");
      out.write("            $set(\"graphicRendererAnalogMin\");\r\n");
      out.write("            $set(\"graphicRendererAnalogMax\");\r\n");
      out.write("            $set(\"graphicRendererAnalogDisplayText\");\r\n");
      out.write("            $set(\"graphicRendererAnalogImageSet\");\r\n");
      out.write("            $set(\"graphicRendererThumbnailScalePercent\");\r\n");
      out.write("            $set(\"graphicRendererDynamicMin\");\r\n");
      out.write("            $set(\"graphicRendererDynamicMax\");\r\n");
      out.write("            $set(\"graphicRendererDynamicDisplayText\");\r\n");
      out.write("            $set(\"graphicRendererDynamicImage\");\r\n");
      out.write("            $set(\"graphicRendererScriptScript\");\r\n");
      out.write("            $set(\"graphicRendererSimpleDisplayPointName\");\r\n");
      out.write("            $set(\"graphicRendererSimpleStyleAttribute\");\r\n");
      out.write("            graphicRendererEditor.displayBinaryImages(null);\r\n");
      out.write("            graphicRendererEditor.displayMultistateImages(null);\r\n");
      out.write("            // Update the data in the form.\r\n");
      out.write("            if (comp.typeName == \"analogGraphic\") {\r\n");
      out.write("                $set(\"graphicRendererAnalogMin\", comp.min);\r\n");
      out.write("                $set(\"graphicRendererAnalogMax\", comp.max);\r\n");
      out.write("                $set(\"graphicRendererAnalogDisplayText\", comp.displayText);\r\n");
      out.write("                $set(\"graphicRendererAnalogImageSet\", comp.imageSetId);\r\n");
      out.write("                graphicRendererEditor.updateSampleImageSet($(\"graphicRendererAnalogImageSet\"));\r\n");
      out.write("            }\r\n");
      out.write("            else if (comp.typeName == \"binaryGraphic\") {\r\n");
      out.write("                $set(\"graphicRendererBinaryDisplayText\", comp.displayText);\r\n");
      out.write("                $set(\"graphicRendererBinaryImageSet\", comp.imageSetId);\r\n");
      out.write("                graphicRendererEditor.displayBinaryImages(comp.imageSetId);\r\n");
      out.write("                graphicRendererEditor.setZeroImage(comp.zeroImage);\r\n");
      out.write("                graphicRendererEditor.setOneImage(comp.oneImage);\r\n");
      out.write("            }\r\n");
      out.write("            else if (comp.typeName == \"dynamicGraphic\") {\r\n");
      out.write("                $set(\"graphicRendererDynamicMin\", comp.min);\r\n");
      out.write("                $set(\"graphicRendererDynamicMax\", comp.max);\r\n");
      out.write("                $set(\"graphicRendererDynamicDisplayText\", comp.displayText);\r\n");
      out.write("                $set(\"graphicRendererDynamicImage\", comp.dynamicImageId);\r\n");
      out.write("            }\r\n");
      out.write("            else if (comp.typeName == \"multistateGraphic\") {\r\n");
      out.write("                $set(\"graphicRendererMultistateDisplayText\", comp.displayText);\r\n");
      out.write("                $set(\"graphicRendererMultistateImageSet\", comp.imageSetId);\r\n");
      out.write("                graphicRendererEditor.displayMultistateImages(comp.imageSetId);\r\n");
      out.write("                var imageStates = comp.imageStateList;\r\n");
      out.write("                \r\n");
      out.write("                var i=0;\r\n");
      out.write("                while ($(\"graphicRendererMultistateState\"+ i))\r\n");
      out.write("                    $set(\"graphicRendererMultistateState\"+ (i++), \"\");\r\n");
      out.write("                for (var i=0; i<imageStates.length; i++)\r\n");
      out.write("                    $set(\"graphicRendererMultistateState\"+ imageStates[i].key, imageStates[i].value);\r\n");
      out.write("                $set(\"graphicRendererMultistateDefault\", comp.defaultImage);\r\n");
      out.write("            }\r\n");
      out.write("            else if (comp.typeName == \"script\")\r\n");
      out.write("                $set(\"graphicRendererScriptScript\", comp.script);\r\n");
      out.write("            else if (comp.typeName == \"simple\") {\r\n");
      out.write("                $set(\"graphicRendererSimpleDisplayPointName\", comp.displayPointName);\r\n");
      out.write("                $set(\"graphicRendererSimpleStyleAttribute\", comp.styleAttribute);\r\n");
      out.write("            } else if (comp.typeName == \"thumbnailImage\")\r\n");
      out.write("                $set(\"graphicRendererThumbnailScalePercent\", comp.scalePercent);\r\n");
      out.write("            else if(comp.typeName == \"button\") {\r\n");
      out.write("            \t$set(\"graphicRendererButtonWhenOnLabel\", comp.whenOnLabel);\r\n");
      out.write("            \t$set(\"graphicRendererButtonWhenOffLabel\", comp.whenOffLabel);\r\n");
      out.write("            \t$set(\"graphicRendererButtonWidth\", comp.width);\r\n");
      out.write("            \t$set(\"graphicRendererButtonHeight\", comp.height);\r\n");
      out.write("            }\r\n");
      out.write("            show(\"graphicRenderer_\"+ comp.typeName);\r\n");
      out.write("            show(\"graphicRendererEditorPopup\");\r\n");
      out.write("        };\r\n");
      out.write("    \r\n");
      out.write("        this.close = function() {\r\n");
      out.write("            hide(\"graphicRendererEditorPopup\");\r\n");
      out.write("            hideContextualMessages(\"graphicRendererEditorPopup\");\r\n");
      out.write("            if (graphicRendererEditor.typeName)\r\n");
      out.write("                hide(\"graphicRenderer_\"+ graphicRendererEditor.typeName);\r\n");
      out.write("        };\r\n");
      out.write("        \r\n");
      out.write("        this.save = function() {\r\n");
      out.write("            hideContextualMessages(\"graphicRendererEditorPopup\");\r\n");
      out.write("            if (graphicRendererEditor.typeName == \"analogGraphic\")\r\n");
      out.write("                ViewDwr.saveAnalogGraphicComponent(graphicRendererEditor.componentId, $get(\"graphicRendererAnalogMin\"),\r\n");
      out.write("                        $get(\"graphicRendererAnalogMax\"), $get(\"graphicRendererAnalogDisplayText\"),\r\n");
      out.write("                        $get(\"graphicRendererAnalogImageSet\"), graphicRendererEditor.saveCB);\r\n");
      out.write("            else if (graphicRendererEditor.typeName == \"binaryGraphic\")\r\n");
      out.write("                ViewDwr.saveBinaryGraphicComponent(graphicRendererEditor.componentId, graphicRendererEditor.zeroImage,\r\n");
      out.write("                        graphicRendererEditor.oneImage, $get(\"graphicRendererBinaryDisplayText\"),\r\n");
      out.write("                        $get(\"graphicRendererBinaryImageSet\"), graphicRendererEditor.saveCB);\r\n");
      out.write("            else if (graphicRendererEditor.typeName == \"dynamicGraphic\")\r\n");
      out.write("                ViewDwr.saveDynamicGraphicComponent(graphicRendererEditor.componentId,\r\n");
      out.write("                        $get(\"graphicRendererDynamicMin\"), $get(\"graphicRendererDynamicMax\"),\r\n");
      out.write("                        $get(\"graphicRendererDynamicDisplayText\"), $get(\"graphicRendererDynamicImage\"),\r\n");
      out.write("                        graphicRendererEditor.saveCB);\r\n");
      out.write("            else if (graphicRendererEditor.typeName == \"multistateGraphic\") {\r\n");
      out.write("                var imageSet = $get(\"graphicRendererMultistateImageSet\");\r\n");
      out.write("                var i = 0, j;\r\n");
      out.write("                var imageStates = new Array();\r\n");
      out.write("                if (imageSet) {\r\n");
      out.write("                    while ($(\"graphicRendererMultistateState\"+ i)) {\r\n");
      out.write("                        text = $get(\"graphicRendererMultistateState\"+ i);\r\n");
      out.write("                        if (text.trim() != \"\")\r\n");
      out.write("                            imageStates[imageStates.length] = {key: i, value: text};\r\n");
      out.write("                        i++;\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                ViewDwr.saveMultistateGraphicComponent(graphicRendererEditor.componentId, imageStates,\r\n");
      out.write("                        $get(\"graphicRendererMultistateDefault\"), $get(\"graphicRendererMultistateDisplayText\"),\r\n");
      out.write("                        imageSet, graphicRendererEditor.saveCB);\r\n");
      out.write("            }\r\n");
      out.write("            else if (graphicRendererEditor.typeName == \"script\")\r\n");
      out.write("                ViewDwr.saveScriptComponent(graphicRendererEditor.componentId, $get(\"graphicRendererScriptScript\"),\r\n");
      out.write("                        graphicRendererEditor.saveCB);\r\n");
      out.write("            else if (graphicRendererEditor.typeName == \"simple\")\r\n");
      out.write("                ViewDwr.saveSimplePointComponent(graphicRendererEditor.componentId,\r\n");
      out.write("                        $get(\"graphicRendererSimpleDisplayPointName\"), \r\n");
      out.write("                        $get(\"graphicRendererSimpleStyleAttribute\"), graphicRendererEditor.saveCB);\r\n");
      out.write("            else if (graphicRendererEditor.typeName == \"thumbnailImage\")\r\n");
      out.write("                ViewDwr.saveThumbnailComponent(graphicRendererEditor.componentId,\r\n");
      out.write("                        $get(\"graphicRendererThumbnailScalePercent\"), graphicRendererEditor.saveCB);\r\n");
      out.write("            else if (graphicRendererEditor.typeName == \"button\") {\r\n");
      out.write("            \tViewDwr.saveButtonComponent(graphicRendererEditor.componentId,\r\n");
      out.write("                        $get(\"graphicRendererButtonWhenOnLabel\"), $get(\"graphicRendererButtonWhenOffLabel\"),$get(\"graphicRendererButtonWidth\"),\r\n");
      out.write("                        $get(\"graphicRendererButtonHeight\"), graphicRendererEditor.saveCB);\r\n");
      out.write("            }\r\n");
      out.write("            else\r\n");
      out.write("                graphicRendererEditor.close();\r\n");
      out.write("        };\r\n");
      out.write("        \r\n");
      out.write("        this.saveCB = function(response) {\r\n");
      out.write("            if (response.hasMessages)\r\n");
      out.write("                showDwrMessages(response.messages);\r\n");
      out.write("            else {\r\n");
      out.write("                graphicRendererEditor.close();\r\n");
      out.write("                MiscDwr.notifyLongPoll(mango.longPoll.pollSessionId);\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("        \r\n");
      out.write("        this.displayBinaryImages = function(imageSetId) {\r\n");
      out.write("            graphicRendererEditor.setZeroImage(-1);\r\n");
      out.write("            graphicRendererEditor.setOneImage(-1);\r\n");
      out.write("            graphicRendererEditor.currentImageSetId = imageSetId;\r\n");
      out.write("            \r\n");
      out.write("            var imageSet = graphicRendererEditor.findImageSet(imageSetId);\r\n");
      out.write("            if (imageSet) {\r\n");
      out.write("                $set(\"graphicRendererBinaryImageSetZero\", graphicRendererEditor.createImageList(imageSet, \"Zero\"));\r\n");
      out.write("                $set(\"graphicRendererBinaryImageSetOne\", graphicRendererEditor.createImageList(imageSet, \"One\"));\r\n");
      out.write("            }\r\n");
      out.write("            else {\r\n");
      out.write("                $set(\"graphicRendererBinaryImageSetZero\");\r\n");
      out.write("                $set(\"graphicRendererBinaryImageSetOne\");\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("        \r\n");
      out.write("        this.createImageList = function(imageSet, type) {\r\n");
      out.write("            var html = \"\";\r\n");
      out.write("            for (var i=0; i<imageSet.imageFilenames.length; i++) {\r\n");
      out.write("                html += \"<a\\\r\n");
      out.write("                  href='javascript:void(0)' onclick='graphicRendererEditor.set\"+ type +\"Image(\"+ i +\")'><img\\\r\n");
      out.write("                    id='graphicRendererBinaryImageSet\"+ type + i +\"' src='\"+ imageSet.imageFilenames[i] +\"'\\\r\n");
      out.write("                    style='display:inline;' border='0'/></a>&nbsp;\";\r\n");
      out.write("            }\r\n");
      out.write("            return html;\r\n");
      out.write("        };\r\n");
      out.write("        \r\n");
      out.write("        this.displayMultistateImages = function(imageSetId) {\r\n");
      out.write("            var imageSet = graphicRendererEditor.findImageSet(imageSetId);\r\n");
      out.write("            var graphicImg = '");
      if (_jspx_meth_tag_005fimg_005f11(_jspx_parent, _jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("            if (imageSet) {\r\n");
      out.write("                var html = \"\\\r\n");
      out.write("                    <table>\\\r\n");
      out.write("                      <tr>\\\r\n");
      out.write("                        <th>");
      if (_jspx_meth_fmt_005fmessage_005f59(_jspx_parent, _jspx_page_context))
        return;
      out.write("</th>\\\r\n");
      out.write("                        <th>");
      if (_jspx_meth_fmt_005fmessage_005f60(_jspx_parent, _jspx_page_context))
        return;
      out.write("</th>\\\r\n");
      out.write("                        <th>");
      if (_jspx_meth_fmt_005fmessage_005f61(_jspx_parent, _jspx_page_context))
        return;
      out.write("</th>\\\r\n");
      out.write("                      </tr>\";\r\n");
      out.write("\r\n");
      out.write("                for (var i=0; i<imageSet.imageFilenames.length; i++) {\r\n");
      out.write("                    html += \"\\\r\n");
      out.write("                        <tr>\\\r\n");
      out.write("                          <td align='center'>\\\r\n");
      out.write("                            <div onmouseover='show(\\\"graphicRendererMultistateImageSet\"+ i +\"\\\");'\\\r\n");
      out.write("                                    onmouseout='hide(\\\"graphicRendererMultistateImageSet\"+ i +\"\\\");'\\\r\n");
      out.write("                                    style='position:relative;display:inline;'>\"+ graphicImg +\"<div \\\r\n");
      out.write("                                    id='graphicRendererMultistateImageSet\"+ i +\"' class='imageDiv'\\\r\n");
      out.write("                                    style='display:none;top:18px;'><img src='\"+ imageSet.imageFilenames[i] +\"'/></div></div>\\\r\n");
      out.write("                          </td>\\\r\n");
      out.write("                          <td><input id='graphicRendererMultistateState\"+ i +\"' type='text' class='formShort'/></td>\\\r\n");
      out.write("                          <td align='center'><input type='radio' name='graphicRendererMultistateDefault' value='\"+ i +\"'/></td>\\\r\n");
      out.write("                        </tr>\";\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                html += \"</table>\";\r\n");
      out.write("                \r\n");
      out.write("                $set(\"graphicRendererMultistateImageSetList\", html);\r\n");
      out.write("            }\r\n");
      out.write("            else\r\n");
      out.write("                $set(\"graphicRendererMultistateImageSetList\");\r\n");
      out.write("        };\r\n");
      out.write("        \r\n");
      out.write("        this.setZeroImage = function(imageId) {\r\n");
      out.write("            var image;\r\n");
      out.write("            if (graphicRendererEditor.zeroImage != -1 && graphicRendererEditor.currentImageSetId)\r\n");
      out.write("                $(\"graphicRendererBinaryImageSetZero\"+ graphicRendererEditor.zeroImage).border = \"0\";\r\n");
      out.write("            graphicRendererEditor.zeroImage = imageId;\r\n");
      out.write("            if (graphicRendererEditor.zeroImage != -1 && graphicRendererEditor.currentImageSetId)\r\n");
      out.write("                $(\"graphicRendererBinaryImageSetZero\"+ graphicRendererEditor.zeroImage).border = \"2\";\r\n");
      out.write("        };\r\n");
      out.write("        this.setOneImage = function(imageId) {\r\n");
      out.write("            var image;\r\n");
      out.write("            if (graphicRendererEditor.oneImage != -1 && graphicRendererEditor.currentImageSetId)\r\n");
      out.write("                $(\"graphicRendererBinaryImageSetOne\"+ graphicRendererEditor.oneImage).border = \"0\";\r\n");
      out.write("            graphicRendererEditor.oneImage = imageId;\r\n");
      out.write("            if (graphicRendererEditor.oneImage != -1 && graphicRendererEditor.currentImageSetId)\r\n");
      out.write("                $(\"graphicRendererBinaryImageSetOne\"+ graphicRendererEditor.oneImage).border = \"2\";\r\n");
      out.write("        };\r\n");
      out.write("        \r\n");
      out.write("        this.updateSampleImageSet = function(selectComp) {\r\n");
      out.write("            var img = $(selectComp.id +\"Sample\");\r\n");
      out.write("            var imageSet = graphicRendererEditor.findImageSet($get(selectComp));\r\n");
      out.write("            if (imageSet) {\r\n");
      out.write("                img.src = imageSet.imageFilenames[0];\r\n");
      out.write("                show(img);\r\n");
      out.write("            }\r\n");
      out.write("            else\r\n");
      out.write("                hide(img);\r\n");
      out.write("        };\r\n");
      out.write("        \r\n");
      out.write("        this.updateSampleDynamicImage = function(selectComp) {\r\n");
      out.write("            var img = $(selectComp.id +\"Sample\");\r\n");
      out.write("            var dynamicImage = graphicRendererEditor.findDynamicImage($get(selectComp));\r\n");
      out.write("            if (dynamicImage) {\r\n");
      out.write("                img.src = dynamicImage.imageFilename;\r\n");
      out.write("                show(img);\r\n");
      out.write("            }\r\n");
      out.write("            else\r\n");
      out.write("                hide(img);\r\n");
      out.write("        };\r\n");
      out.write("        \r\n");
      out.write("        this.findImageSet = function(id) {\r\n");
      out.write("            for (var i=0; i<graphicRendererEditor.imageSets.length; i++) {\r\n");
      out.write("                if (graphicRendererEditor.imageSets[i].id == id)\r\n");
      out.write("                    return graphicRendererEditor.imageSets[i];\r\n");
      out.write("            }\r\n");
      out.write("            return null;\r\n");
      out.write("        };\r\n");
      out.write("        \r\n");
      out.write("        this.findDynamicImage = function(id) {\r\n");
      out.write("            for (var i=0; i<graphicRendererEditor.dynamicImages.length; i++) {\r\n");
      out.write("                if (graphicRendererEditor.dynamicImages[i].id == id)\r\n");
      out.write("                    return graphicRendererEditor.dynamicImages[i];\r\n");
      out.write("            }\r\n");
      out.write("            return null;\r\n");
      out.write("        };\r\n");
      out.write("    }\r\n");
      out.write("    var graphicRendererEditor = new GraphicRendererEditor();\r\n");
      out.write("  </script>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("                  ");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"compoundEditorPopup\" style=\"display:none;left:0px;top:0px;\" class=\"windowDiv\">\r\n");
      out.write("  <table cellpadding=\"0\" cellspacing=\"0\"><tr><td>\r\n");
      out.write("    <table width=\"100%\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>\r\n");
      out.write("          ");
      if (_jspx_meth_tag_005fimg_005f12(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("          <span class=\"copyTitle\" id=\"compoundComponentName\"></span>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td align=\"right\">\r\n");
      out.write("          ");
      if (_jspx_meth_tag_005fimg_005f13(_jspx_parent, _jspx_page_context))
        return;
      out.write("&nbsp;\r\n");
      out.write("          ");
      if (_jspx_meth_tag_005fimg_005f14(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    <table>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f62(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("        <td class=\"formField\"><input id=\"compoundName\" type=\"text\"/></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tbody id=\"simpleCompoundAttrs\">\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabel\">");
      if (_jspx_meth_fmt_005fmessage_005f63(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"compoundBackgroundColour\" type=\"text\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </tbody>\r\n");
      out.write("      <tbody id=\"imageChartAttrs\">\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f64(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"imageChartWidth\" type=\"text\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f65(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"imageChartHeight\" type=\"text\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f66(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\">\r\n");
      out.write("            <input type=\"text\" id=\"imageChartDurationPeriods\" class=\"formShort\"/>\r\n");
      out.write("            <select id=\"imageChartDurationType\">\r\n");
      out.write("              ");
      if (_jspx_meth_tag_005ftimePeriodOptions_005f0(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </select>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </tbody>\r\n");
      out.write("      <tbody id=\"pointLists\"></tbody>\r\n");
      out.write("    </table>\r\n");
      out.write("  </td></tr></table>\r\n");
      out.write("  \r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("    function CompoundEditor() {\r\n");
      out.write("        this.component = null;\r\n");
      out.write("        this.pointList = [];\r\n");
      out.write("        \r\n");
      out.write("        this.open = function(compId) {\r\n");
      out.write("            ViewDwr.getViewComponent(compId, function(comp) {\r\n");
      out.write("                compoundEditor.component = comp;\r\n");
      out.write("                $set(\"compoundComponentName\", comp.displayName);\r\n");
      out.write("                \r\n");
      out.write("                // Update the point lists\r\n");
      out.write("                compoundEditor.updatePointLists();\r\n");
      out.write("                \r\n");
      out.write("                // Update the data in the form.\r\n");
      out.write("                $set(\"compoundName\", comp.name);\r\n");
      out.write("                \r\n");
      out.write("                if (comp.defName == \"simpleCompound\") {\r\n");
      out.write("                    $set(\"compoundBackgroundColour\", comp.backgroundColour);\r\n");
      out.write("                    show(\"simpleCompoundAttrs\");\r\n");
      out.write("                }\r\n");
      out.write("                else\r\n");
      out.write("                    hide(\"simpleCompoundAttrs\");\r\n");
      out.write("                \r\n");
      out.write("                if (comp.defName == \"imageChart\") {\r\n");
      out.write("                    $set(\"imageChartWidth\", comp.width);\r\n");
      out.write("                    $set(\"imageChartHeight\", comp.height);\r\n");
      out.write("                    $set(\"imageChartDurationType\", comp.durationType);\r\n");
      out.write("                    $set(\"imageChartDurationPeriods\", comp.durationPeriods);\r\n");
      out.write("                    show(\"imageChartAttrs\");\r\n");
      out.write("                }\r\n");
      out.write("                else\r\n");
      out.write("                    hide(\"imageChartAttrs\");\r\n");
      out.write("                \r\n");
      out.write("                show(\"compoundEditorPopup\");\r\n");
      out.write("            });\r\n");
      out.write("            \r\n");
      out.write("            positionEditor(compId, \"compoundEditorPopup\");\r\n");
      out.write("        };\r\n");
      out.write("        \r\n");
      out.write("        this.close = function() {\r\n");
      out.write("            hide(\"compoundEditorPopup\");\r\n");
      out.write("            hideContextualMessages(\"compoundEditorPopup\");\r\n");
      out.write("        };\r\n");
      out.write("        \r\n");
      out.write("        this.save = function() {\r\n");
      out.write("            hideContextualMessages(\"compoundEditorPopup\");\r\n");
      out.write("            \r\n");
      out.write("            // Gather the point settings\r\n");
      out.write("            var pointChildren = compoundEditor.getPointChildren();\r\n");
      out.write("            var childPointIds = new Array();\r\n");
      out.write("            var sel;\r\n");
      out.write("            for (var i=0; i<pointChildren.length; i++)\r\n");
      out.write("                childPointIds.push({key: pointChildren[i].id, value: $get(\"compoundPointSelect\"+ pointChildren[i].id)});\r\n");
      out.write("            \r\n");
      out.write("            if (compoundEditor.component.defName == \"simpleCompound\")\r\n");
      out.write("                ViewDwr.saveSimpleCompoundComponent(compoundEditor.component.id, $get(\"compoundName\"),\r\n");
      out.write("                        $get(\"compoundBackgroundColour\"), childPointIds, compoundEditor.saveCB);\r\n");
      out.write("            else if (compoundEditor.component.defName == \"imageChart\")\r\n");
      out.write("                ViewDwr.saveImageChartComponent(compoundEditor.component.id, $get(\"compoundName\"),\r\n");
      out.write("                        $get(\"imageChartWidth\"), $get(\"imageChartHeight\"), $get(\"imageChartDurationType\"),\r\n");
      out.write("                        $get(\"imageChartDurationPeriods\"), childPointIds, compoundEditor.saveCB);\r\n");
      out.write("            else\r\n");
      out.write("                ViewDwr.saveCompoundComponent(compoundEditor.component.id, $get(\"compoundName\"), childPointIds,\r\n");
      out.write("                        compoundEditor.saveCB);\r\n");
      out.write("        };\r\n");
      out.write("        \r\n");
      out.write("        this.saveCB = function(response) {\r\n");
      out.write("            if (response.hasMessages)\r\n");
      out.write("                showDwrMessages(response.messages);\r\n");
      out.write("            else {\r\n");
      out.write("                if (compoundEditor.component.defName == \"simpleCompound\")\r\n");
      out.write("                    $(\"c\"+ compoundEditor.component.id +\"Info\").style.background = $get(\"compoundBackgroundColour\");\r\n");
      out.write("                \r\n");
      out.write("                compoundEditor.close();\r\n");
      out.write("                MiscDwr.notifyLongPoll(mango.longPoll.pollSessionId);\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("        \r\n");
      out.write("        this.setPointList = function(pointList) {\r\n");
      out.write("            compoundEditor.pointList = pointList;\r\n");
      out.write("        };\r\n");
      out.write("        \r\n");
      out.write("        this.updatePointLists = function() {\r\n");
      out.write("            var pointChildren = compoundEditor.getPointChildren();\r\n");
      out.write("            \r\n");
      out.write("            // Create the select controls\r\n");
      out.write("            dwr.util.removeAllRows(\"pointLists\");\r\n");
      out.write("            dwr.util.addRows(\"pointLists\", pointChildren,\r\n");
      out.write("                [\r\n");
      out.write("                    function(data) { return data.description; },\r\n");
      out.write("                    function(data) { return '<select id=\"compoundPointSelect'+ data.id +'\"></select>'; }\r\n");
      out.write("                ],\r\n");
      out.write("                {\r\n");
      out.write("                    cellCreator: function(options) {\r\n");
      out.write("                        var td = document.createElement(\"td\");\r\n");
      out.write("                        if (options.cellNum == 0) {\r\n");
      out.write("                            if (compoundEditor.component.defName == \"simpleCompound\" &&\r\n");
      out.write("                                    options.rowData.id == \"");
      out.print( SimpleCompoundComponent.LEAD_POINT );
      out.write("\")\r\n");
      out.write("                                td.className = \"formLabelRequired\";\r\n");
      out.write("                            else\r\n");
      out.write("                                td.className = \"formLabel\";\r\n");
      out.write("                        }\r\n");
      out.write("                        else if (options.cellNum == 1)\r\n");
      out.write("                            td.className = \"formField\";\r\n");
      out.write("                        return td;\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            );\r\n");
      out.write("            \r\n");
      out.write("            // Add options to the controls.\r\n");
      out.write("            var sel, p;\r\n");
      out.write("            for (var i=0; i<pointChildren.length; i++) {\r\n");
      out.write("                sel = $(\"compoundPointSelect\"+ pointChildren[i].id);\r\n");
      out.write("                sel.options[0] = new Option(\"\", 0);\r\n");
      out.write("                for (p=0; p<compoundEditor.pointList.length; p++) {\r\n");
      out.write("                    if (contains(pointChildren[i].dataTypes, compoundEditor.pointList[p].dataType))\r\n");
      out.write("                        sel.options[sel.options.length] = new Option(settingsEditor.pointList[p].name,\r\n");
      out.write("                                settingsEditor.pointList[p].id);\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                // Set the control default value.\r\n");
      out.write("                $set(sel, pointChildren[i].viewComponent.dataPointId);\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("        \r\n");
      out.write("        this.getPointChildren = function() {\r\n");
      out.write("            var pointChildren = new Array();\r\n");
      out.write("            for (var i=0; i<compoundEditor.component.childComponents.length; i++) {\r\n");
      out.write("                if (compoundEditor.component.childComponents[i].viewComponent.pointComponent)\r\n");
      out.write("                    pointChildren.push(compoundEditor.component.childComponents[i]);\r\n");
      out.write("            }\r\n");
      out.write("            return pointChildren;\r\n");
      out.write("        };\r\n");
      out.write("    }\r\n");
      out.write("    var compoundEditor = new CompoundEditor();\r\n");
      out.write("  </script>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("                  ");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<div id=\"customEditorPopup\" style=\"display:none;left:0px;top:0px;\" class=\"windowDiv\">\r\n");
      out.write("  <table cellpadding=\"0\" cellspacing=\"0\"><tr><td>\r\n");
      out.write("    <table width=\"100%\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>\r\n");
      out.write("          ");
      if (_jspx_meth_tag_005fimg_005f15(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("          <span class=\"copyTitle\" id=\"graphicsComponentName\"></span>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td align=\"right\">\r\n");
      out.write("          ");
      if (_jspx_meth_tag_005fimg_005f16(_jspx_parent, _jspx_page_context))
        return;
      out.write("&nbsp;\r\n");
      out.write("          ");
      if (_jspx_meth_tag_005fimg_005f17(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    \r\n");
      out.write("    <table>\r\n");
      out.write("      <tbody id=\"customEditor_alarmlist\" style=\"display:none;\">\r\n");
      out.write("      \t<tr>\r\n");
      out.write("          <td class=\"formLabel\">");
      if (_jspx_meth_fmt_005fmessage_005f67(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><select id=\"customEditorAlarmListMinAlarmLevel\">");
      if (_jspx_meth_tag_005falarmLevelOptions_005f0(_jspx_parent, _jspx_page_context))
        return;
      out.write("</select></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      \t<tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f68(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"customEditorAlarmListMaxListSize\" type=\"text\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_005fmessage_005f69(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"customEditorAlarmListWidth\" type=\"text\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabel\">");
      if (_jspx_meth_fmt_005fmessage_005f70(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"customEditorAlarmListIdColumn\" type=\"checkbox\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabel\">");
      if (_jspx_meth_fmt_005fmessage_005f71(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"customEditorAlarmListAlarmLevelColumn\" type=\"checkbox\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabel\">");
      if (_jspx_meth_fmt_005fmessage_005f72(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"customEditorAlarmListTimestampColumn\" type=\"checkbox\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabel\">");
      if (_jspx_meth_fmt_005fmessage_005f73(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"customEditorAlarmListInactivityColumn\" type=\"checkbox\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"formLabel\">");
      if (_jspx_meth_fmt_005fmessage_005f74(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("          <td class=\"formField\"><input id=\"customEditorAlarmListAckColumn\" type=\"checkbox\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </tbody>\r\n");
      out.write("      \r\n");
      out.write("      <tbody id=\"customEditor_button\" style=\"display:none;\">\r\n");
      out.write("        \r\n");
      out.write("      </tbody>\r\n");
      out.write("      \r\n");
      out.write("    </table>\r\n");
      out.write("  </td></tr></table>\r\n");
      out.write("  \r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("    function CustomEditor() {\r\n");
      out.write("        this.componentId = null;\r\n");
      out.write("        this.typeName = null;\r\n");
      out.write("        \r\n");
      out.write("        this.open = function(compId) {\r\n");
      out.write("            customEditor.componentId = compId;\r\n");
      out.write("            \r\n");
      out.write("            // Set the renderers for the data type of this point view.\r\n");
      out.write("            ViewDwr.getViewComponent(compId, customEditor.setViewComponent);\r\n");
      out.write("            \r\n");
      out.write("            positionEditor(compId, \"customEditorPopup\");\r\n");
      out.write("        };\r\n");
      out.write("        \r\n");
      out.write("        this.setViewComponent = function(comp) {\r\n");
      out.write("            customEditor.typeName = comp.typeName;\r\n");
      out.write("            \r\n");
      out.write("            // Update the data in the form.\r\n");
      out.write("            if (comp.typeName == \"alarmlist\") {\r\n");
      out.write("            \t$set(\"customEditorAlarmListMinAlarmLevel\",comp.minAlarmLevel);\r\n");
      out.write("                $set(\"customEditorAlarmListMaxListSize\",comp.maxListSize);\r\n");
      out.write("                $set(\"customEditorAlarmListWidth\",comp.width);\r\n");
      out.write("                $set(\"customEditorAlarmListIdColumn\",comp.hideIdColumn);\r\n");
      out.write("                $set(\"customEditorAlarmListAlarmLevelColumn\",comp.hideAlarmLevelColumn);\r\n");
      out.write("                $set(\"customEditorAlarmListTimestampColumn\",comp.hideTimestampColumn);\r\n");
      out.write("                $set(\"customEditorAlarmListInactivityColumn\",comp.hideInactivityColumn);\r\n");
      out.write("                $set(\"customEditorAlarmListAckColumn\",comp.hideAckColumn);\r\n");
      out.write("                \r\n");
      out.write("            } else if(comp.typeName == \"yourCustomComponent\") {\r\n");
      out.write("                \r\n");
      out.write("            }\r\n");
      out.write("            show(\"customEditor_\"+ comp.typeName);\r\n");
      out.write("            show(\"customEditorPopup\");\r\n");
      out.write("        };\r\n");
      out.write("    \r\n");
      out.write("        this.close = function() {\r\n");
      out.write("            hide(\"customEditorPopup\");\r\n");
      out.write("            //hideContextualMessages(\"customEditorPopup\");\r\n");
      out.write("            if (customEditor.typeName)\r\n");
      out.write("                hide(\"customEditor_\"+ customEditor.typeName);\r\n");
      out.write("        };\r\n");
      out.write("        \r\n");
      out.write("        this.save = function() {\r\n");
      out.write("            //hideContextualMessages(\"graphicRendererEditorPopup\");\r\n");
      out.write("            if (customEditor.typeName == \"alarmlist\")\r\n");
      out.write("            \tViewDwr.saveAlarmListComponent(customEditor.componentId,\r\n");
      out.write("                    \t$get(\"customEditorAlarmListMinAlarmLevel\"), $get(\"customEditorAlarmListMaxListSize\"),\r\n");
      out.write("                        $get(\"customEditorAlarmListWidth\"),$get(\"customEditorAlarmListIdColumn\"),\r\n");
      out.write("                        $get(\"customEditorAlarmListAlarmLevelColumn\"),$get(\"customEditorAlarmListTimestampColumn\"),\r\n");
      out.write("                        $get(\"customEditorAlarmListInactivityColumn\"),$get(\"customEditorAlarmListAckColumn\"), \r\n");
      out.write("                        customEditor.saveCB);\r\n");
      out.write("            else if (customEditor.typeName == \"yourCustomComponent\")\r\n");
      out.write("            \talert('save your custom component component!');\r\n");
      out.write("            \r\n");
      out.write("        };\r\n");
      out.write("        \r\n");
      out.write("        this.saveCB = function(response) {\r\n");
      out.write("            if (response.hasMessages)\r\n");
      out.write("                showDwrMessages(response.messages);\r\n");
      out.write("            else {\r\n");
      out.write("                customEditor.close();\r\n");
      out.write("                MiscDwr.notifyLongPoll(mango.longPoll.pollSessionId);\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("        \r\n");
      out.write("    }\r\n");
      out.write("    var customEditor = new CustomEditor();\r\n");
      out.write("  </script>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("              </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("            <tr><td colspan=\"3\">&nbsp;</td></tr>\r\n");
      out.write("            \r\n");
      out.write("            <tr>\r\n");
      out.write("              <td colspan=\"2\" align=\"center\">\r\n");
      out.write("                <input type=\"submit\" name=\"save\" value=\"");
      if (_jspx_meth_fmt_005fmessage_005f75(_jspx_parent, _jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                <input type=\"submit\" name=\"delete\" value=\"");
      if (_jspx_meth_fmt_005fmessage_005f76(_jspx_parent, _jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                <input type=\"submit\" name=\"cancel\" value=\"");
      if (_jspx_meth_fmt_005fmessage_005f77(_jspx_parent, _jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("              </td>\r\n");
      out.write("              <td></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("          </table>\r\n");
      out.write("        \r\n");
      out.write("          <div id=\"pointTemplate\" onmouseover=\"showLayer('c'+ getViewComponentId(this) +'Controls');\"\r\n");
      out.write("                  onmouseout=\"hideLayer('c'+ getViewComponentId(this) +'Controls');\"\r\n");
      out.write("                  style=\"position:absolute;left:0px;top:0px;display:none;\">\r\n");
      out.write("            <div id=\"c_TEMPLATE_Content\"><img src=\"images/icon_comp.png\" alt=\"\"/></div>\r\n");
      out.write("            <div id=\"c_TEMPLATE_Controls\" class=\"controlsDiv\">\r\n");
      out.write("              <table cellpadding=\"0\" cellspacing=\"1\">\r\n");
      out.write("                <tr onmouseover=\"showMenu('c'+ getViewComponentId(this) +'Info', 16, 0);\"\r\n");
      out.write("                        onmouseout=\"hideLayer('c'+ getViewComponentId(this) +'Info');\">\r\n");
      out.write("                  <td>\r\n");
      out.write("                    <img src=\"images/information.png\" alt=\"\"/>\r\n");
      out.write("                    <div id=\"c_TEMPLATE_Info\" onmouseout=\"hideLayer(this);\">\r\n");
      out.write("                      ");
      if (_jspx_meth_tag_005fimg_005f18(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr><td>");
      if (_jspx_meth_tag_005fimg_005f19(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td></tr>\r\n");
      out.write("                <tr><td>");
      if (_jspx_meth_tag_005fimg_005f20(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td></tr>\r\n");
      out.write("                <tr><td>");
      if (_jspx_meth_tag_005fimg_005f21(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td></tr>\r\n");
      out.write("              </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div style=\"position:absolute;left:-16px;top:0px;z-index:1;\">\r\n");
      out.write("              <div id=\"c_TEMPLATE_Warning\" style=\"display:none;\"\r\n");
      out.write("                      onmouseover=\"showMenu('c'+ getViewComponentId(this) +'Messages', 16, 0);\"\r\n");
      out.write("                      onmouseout=\"hideLayer('c'+ getViewComponentId(this) +'Messages');\">\r\n");
      out.write("                ");
      if (_jspx_meth_tag_005fimg_005f22(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                <div id=\"c_TEMPLATE_Messages\" onmouseout=\"hideLayer(this);\" class=\"controlContent\"></div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          <div id=\"htmlTemplate\" onmouseover=\"showLayer('c'+ getViewComponentId(this) +'Controls');\"\r\n");
      out.write("                  onmouseout=\"hideLayer('c'+ getViewComponentId(this) +'Controls');\"\r\n");
      out.write("                  style=\"position:absolute;left:0px;top:0px;display:none;\">\r\n");
      out.write("            <div id=\"c_TEMPLATE_Content\"></div>\r\n");
      out.write("            <div id=\"c_TEMPLATE_Controls\" class=\"controlsDiv\">\r\n");
      out.write("              <table cellpadding=\"0\" cellspacing=\"1\">\r\n");
      out.write("                <tr><td>");
      if (_jspx_meth_tag_005fimg_005f23(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td></tr>\r\n");
      out.write("                <tr><td>");
      if (_jspx_meth_tag_005fimg_005f24(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td></tr>\r\n");
      out.write("              </table>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          <div id=\"imageChartTemplate\" onmouseover=\"showLayer('c'+ getViewComponentId(this) +'Controls');\"\r\n");
      out.write("                  onmouseout=\"hideLayer('c'+ getViewComponentId(this) +'Controls');\"\r\n");
      out.write("                  style=\"position:absolute;left:0px;top:0px;display:none;\">\r\n");
      out.write("            <span id=\"c_TEMPLATE_Content\"></span>\r\n");
      out.write("            <div id=\"c_TEMPLATE_Controls\" class=\"controlsDiv\">\r\n");
      out.write("              <table cellpadding=\"0\" cellspacing=\"1\">\r\n");
      out.write("                <tr><td>");
      if (_jspx_meth_tag_005fimg_005f25(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td></tr>\r\n");
      out.write("                <tr><td>");
      if (_jspx_meth_tag_005fimg_005f26(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td></tr>\r\n");
      out.write("              </table>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("            \r\n");
      out.write("          <div id=\"compoundTemplate\" onmouseover=\"showLayer('c'+ getViewComponentId(this) +'Controls');\"\r\n");
      out.write("                  onmouseout=\"hideLayer('c'+ getViewComponentId(this) +'Controls');\"\r\n");
      out.write("                  style=\"position:absolute;left:0px;top:0px;display:none;\">\r\n");
      out.write("            <span id=\"c_TEMPLATE_Content\"></span>\r\n");
      out.write("            <div id=\"c_TEMPLATE_Controls\" class=\"controlsDiv\">\r\n");
      out.write("              <table cellpadding=\"0\" cellspacing=\"1\">\r\n");
      out.write("                <tr onmouseover=\"showMenu('c'+ getViewComponentId(this) +'Info', 16, 0);\"\r\n");
      out.write("                        onmouseout=\"hideLayer('c'+ getViewComponentId(this) +'Info');\">\r\n");
      out.write("                  <td>\r\n");
      out.write("                    <img src=\"images/information.png\" alt=\"\"/>\r\n");
      out.write("                    <div id=\"c_TEMPLATE_Info\" onmouseout=\"hideLayer(this);\">\r\n");
      out.write("                      ");
      if (_jspx_meth_tag_005fimg_005f27(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr><td>");
      if (_jspx_meth_tag_005fimg_005f28(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td></tr>\r\n");
      out.write("                <tr><td>");
      if (_jspx_meth_tag_005fimg_005f29(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td></tr>\r\n");
      out.write("              </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div id=\"c_TEMPLATE_ChildComponents\"></div>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          <div id=\"compoundChildTemplate\" style=\"position:absolute;left:0px;top:0px;display:none;\">\r\n");
      out.write("            <div id=\"c_TEMPLATE_Content\"><img src=\"images/icon_comp.png\" alt=\"\"/></div>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          <div id=\"customTemplate\" onmouseover=\"showLayer('c'+ getViewComponentId(this) +'Controls');\"\r\n");
      out.write("                  onmouseout=\"hideLayer('c'+ getViewComponentId(this) +'Controls');\"\r\n");
      out.write("                  style=\"position:absolute;left:0px;top:0px;display:none;\">\r\n");
      out.write("            <div id=\"c_TEMPLATE_Content\"></div>\r\n");
      out.write("            <div id=\"c_TEMPLATE_Controls\" class=\"controlsDiv\">\r\n");
      out.write("              <table cellpadding=\"0\" cellspacing=\"1\">\r\n");
      out.write("                <tr><td>");
      if (_jspx_meth_tag_005fimg_005f30(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td></tr>\r\n");
      out.write("                <tr><td>");
      if (_jspx_meth_tag_005fimg_005f31(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td></tr>\r\n");
      out.write("              </table>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("  </form>\r\n");
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
