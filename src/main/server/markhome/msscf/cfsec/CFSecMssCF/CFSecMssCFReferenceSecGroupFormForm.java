
// Description: Java 11 MssCF Reference for SecGroupForm Relationship Form.

/*
 *	server.markhome.msscf.CFSec
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfsec.CFSecMssCF;

import java.sql.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cfcore.MssCF.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfsec.CFSecObj.*;

/**
 *	CFSecMssCFReferenceSecGroupFormForm binds SecGroupForm.Form
 *	as an instance of MssCFGenReferenceObj.
 */
public class CFSecMssCFReferenceSecGroupFormForm
	extends MssCFGenReferenceObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFReferenceSecGroupFormForm() {
		super();
	}

	public CFSecMssCFReferenceSecGroupFormForm( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"SecGroupForm",
			"Form",
			"SecForm" );
	}

	public ICFLibAnyObj dereference( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFReferenceSecGroupFormForm.dereference() ";

		if( genContext == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"genContext" );
		}

		ICFLibAnyObj genDef = genContext.getGenDef();
		if( genDef == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"genContext.getGenDef()" );
		}

		ICFSecSecFormObj obj;

		if( genDef instanceof ICFSecSecGroupFormObj ) {
			obj = (ICFSecSecFormObj)((ICFSecSecGroupFormObj)genDef).getRequiredParentForm();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"genContext.getGenDef()",
				genDef,
				"ICFSecSecGroupFormObj" );
		}

		return( obj );
	}
}
